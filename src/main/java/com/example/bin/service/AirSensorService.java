package com.example.bin.service;

import com.example.bin.entity.AirSensor;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Air Sensor 服务层接口类
 *
 * @author Lu
 * @date 18/5/8 17:34
 */
@Transactional(rollbackFor = Exception.class)
public interface AirSensorService {
    /**
     * 传入 duid、开始时间、结束时间进行查询指定 duid 在某段时间范围内的数据
     *
     * @param duid      duid值
     * @param timeStart 开始时间
     * @param timeEnd   结束时间
     *
     * @return List<AirSensor>
     */
    List<AirSensor> listAirSensorsByDuidAndTimeRange(Long duid, Date timeStart, Date timeEnd);
}
