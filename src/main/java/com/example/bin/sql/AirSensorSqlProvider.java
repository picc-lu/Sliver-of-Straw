package com.example.bin.sql;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

import java.util.Date;

/**
 * Air Sensor Sql Provider 为Air Sensor Mapper 提供动态 SQL
 *
 * @author Lu
 * @date 2018-05-15 13:47
 */
public class AirSensorSqlProvider {
    private static final String AIR_SENSOR_TABLE_NAME = "data_air_sensor_co";

    /**
     * 生成查询 SQL
     *
     * @param timeStart 开始时间
     * @param timeEnd   结束时间
     *
     * @return String
     */
    public String listAirSensorsByDuidAndTimeRange(@Param("timeStart") final Date timeStart,
            @Param("timeEnd") final Date timeEnd) {
        String s = new SQL() {{
            SELECT("*");
            FROM(AIR_SENSOR_TABLE_NAME);
            WHERE("duid=#{duid}");
            if (timeStart != null) {
                WHERE("collection_time>=#{timeStart}");
            }
            if (timeEnd != null) {
                WHERE("collection_time<=#{timeEnd}");
            }
        }}.toString();
        System.out.println(s);
        return s;
    }
}
