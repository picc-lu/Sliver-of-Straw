package com.example.bin.service;

import com.example.bin.entity.AirSensor;
import com.example.bin.mapper.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

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

    @Test
    public void selectAirSensorsByDuidAndTimeRange() {
        //        Assert.notNull(airSensorService, "airSensorService不能为空！");
        //        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //        Date timeStart = new Date();
        //        Date timeEnd = new Date();
        //        try {
        //            timeStart = simpleDateFormat.parse("2018-01-08 00:00:00");
        //            timeEnd = simpleDateFormat.parse("2018-01-08 11:03:00");
        //        } catch (ParseException e) {
        //            e.printStackTrace();
        //        }
        //        List<AirSensor> airSensors = airSensorService.listAirSensorsByDuidAndTimeRange(123L, timeStart, timeEnd);
        //        Assert.notEmpty(airSensors, "List长度不能为0！");

        //        Field[] fields = this.getClass().getDeclaredFields();
        //        String[] fieldsName = new String[fields.length];
        //
        //        for (int i = 0; i < fields.length; i++) {
        //            fieldsName[i] = fields[i].getName();
        //        }
        //        for (String str : fieldsName) {
        //            System.out.println(str);
        //        }
        ArrayList<String> attrs = getAttrNames(AirSensor.class, User.class);
        for (String string : attrs) {
            System.out.println(string);
        }
        ArrayList<String> methodNames = getGetMethodNames(Class.class);
        for (String string : methodNames) {
            System.out.println(string);
        }

        //        System.out.println(airSensors);
    }

    private ArrayList<String> getAttrNames(Class... classes) {
        ArrayList<String> attrs = new ArrayList<>();
        for (Class clazz : classes) {
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                attrs.add(field.getName());
            }
        }
        return attrs;
    }

    private ArrayList<String> getGetMethodNames(Class... classes) {
        ArrayList<String> methodNames = new ArrayList<>();
        for (Class clazz : classes) {
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                String getMethodName = method.getName();
                if ("get".startsWith(getMethodName)) {
                    methodNames.add(getMethodName);
                }
            }
        }
        return methodNames;
    }
}