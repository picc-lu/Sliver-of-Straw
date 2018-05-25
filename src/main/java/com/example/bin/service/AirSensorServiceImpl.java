package com.example.bin.service;

import com.example.bin.entity.AirSensor;
import com.example.bin.mapper.AirSensorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * Air Sensor 服务层实现类
 *
 * @author Lu
 * @date 18/5/8 17:34
 */
@Service
public class AirSensorServiceImpl implements AirSensorService {

    private AirSensorMapper airSensorMapper;

    @Autowired
    public AirSensorServiceImpl(AirSensorMapper airSensorMapper) {
        Assert.notNull(airSensorMapper, "airSensorMapper不能为空！");
        this.airSensorMapper = airSensorMapper;
    }

    public AirSensorServiceImpl() {}


    /**
     * 传入 duid、开始时间、结束时间进行查询指定 duid 在某段时间范围内的数据
     *
     * @param duid      duid值
     * @param timeStart 开始时间
     * @param timeEnd   结束时间
     *
     * @return List<AirSensor>
     */
    @Override
    public List<AirSensor> listAirSensorsByDuidAndTimeRange(Long duid, Date timeStart, Date timeEnd) {
        return airSensorMapper.listAirSensorsByDuidAndTimeRange(duid, timeStart, timeEnd);
    }

    @Override
    public List<AirSensor> listAllAirSensors() {
        return airSensorMapper.listAllAirSensors();
    }
}
