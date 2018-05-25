package com.example.bin.service;

//import org.junit.Assert;

import com.example.bin.entity.AirSensor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Air Sensor 测试类
 *
 * @author Lu
 * @date 18/5/10 9:11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AirSensorServiceImplTest {
    @Autowired
    private AirSensorService airSensorService;

    public void multiParams(Object... args) {
        System.out.println(args[2]);
    }

    @Test
    public void mainTest() {
        Assert.notNull(airSensorService, "airSensorService不能为空！");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date timeStart = new Date();
        Date timeEnd = new Date();
        try {
            timeStart = simpleDateFormat.parse("2018-01-08 00:00:00");
            timeEnd = simpleDateFormat.parse("2018-01-08 11:03:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        List<AirSensor> airSensors = airSensorService.listAirSensorsByDuidAndTimeRange(123L, timeStart, timeEnd);
        //        List<AirSensor> airSensors = airSensorService.listAllAirSensors();
        System.out.println(airSensors.size());
    }

}