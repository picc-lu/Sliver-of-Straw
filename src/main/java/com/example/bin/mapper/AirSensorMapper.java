package com.example.bin.mapper;

import com.example.bin.entity.AirSensor;
import com.example.bin.sql.AirSensorSqlProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Air Sensor DAO类
 *
 * @author Lu
 * @date 18/5/8 17:34
 */
@Repository
@Mapper
public interface AirSensorMapper {

    /**
     * 传入 duid、开始时间、结束时间进行查询指定 duid 在某段时间范围内的数据
     *
     * @param duid      duid
     * @param timeStart 开始时间
     * @param timeEnd   结束时间
     *
     * @return List<AirSensor>
     */
    @ResultMap("BaseResultMap")
    @SelectProvider(type = AirSensorSqlProvider.class, method = "universalSelect")
    List<AirSensor> listAirSensorsByDuidAndTimeRange(@Param("duid") Long duid, @Param("timeStart") Date timeStart,
            @Param("timeEnd") Date timeEnd);

    @ResultMap("BaseResultMap")
    @SelectProvider(type = AirSensorSqlProvider.class, method = "universalSelectNoParam")
    List<AirSensor> listAllAirSensors();
}