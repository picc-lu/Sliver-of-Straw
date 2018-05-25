package com.example.bin.sql;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.builder.annotation.ProviderContext;
import org.apache.ibatis.jdbc.SQL;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Date;
import java.util.Map;

/**
 * Air Sensor Sql Provider 为Air Sensor Mapper提供动态 SQL
 *
 * @author Lu
 * @date 2018-05-15 13:47
 */
public class AirSensorSqlProvider {
    private static final String AIR_SENSOR_TABLE_NAME = "data_air_sensor_co";

    public String universalSelectNoParam(ProviderContext providerContext) {
        String sql = "";
        try {
            Method mapperMethod = providerContext.getMapperMethod();
            Method providerMethod = this.getClass().getMethod(mapperMethod.getName());
            sql = (String) providerMethod.invoke(this);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return sql;
    }

    public String universalSelect(ProviderContext providerContext, Map<String, Object> map) {
        String sql = "";
        String keyPrefix = "param";
        Method mapperMethod = providerContext.getMapperMethod();
        Object[] params = new Object[mapperMethod.getParameterCount()];
        for (Map.Entry entry : map.entrySet()) {
            String key = (String) entry.getKey();
            if (key.startsWith(keyPrefix)) {
                params[Integer.parseInt(key.substring(keyPrefix.length())) - 1] = entry.getValue();
            }
        }
        try {
            Method providerMethod = this.getClass().getMethod(mapperMethod.getName(), mapperMethod.getParameterTypes());
            // invoke method with parameters.
            sql = (String) providerMethod.invoke(this, params);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return sql;
    }

    /**
     * 生成查询 SQL
     *
     * @param timeStart 开始时间
     * @param timeEnd   结束时间
     *
     * @return String
     */
    public String listAirSensorsByDuidAndTimeRange(@Param("duid") final Long duid,
            @Param("timeStart") final Date timeStart, @Param("timeEnd") final Date timeEnd) {
        return new SQL() {{
            SELECT("*");
            FROM(AIR_SENSOR_TABLE_NAME);
            WHERE("duid = #{duid}");
            if (timeStart != null) {
                WHERE("collection_time >= #{timeStart}");
            }
            if (timeEnd != null) {
                WHERE("collection_time <= #{timeEnd}");
            }
        }}.toString();
    }

    public String listAllAirSensors() {
        return "SELECT * FROM " + AIR_SENSOR_TABLE_NAME;
    }
}
