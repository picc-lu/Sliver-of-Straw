package com.example.base.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.base.entity.BaseEntity;

import java.util.List;

/**
 * 基础 Service 接口
 *
 * @author BAIYEQIYA
 * @version 1.0.0
 * @date 2018/5/10 11:24
 * @since JDK 1.8
 */
public interface BaseService<T extends BaseEntity> extends IService<T> {

    /**
     * 根据数据范围查询数据。
     *
     * @param column 需要筛选的字段名称。
     * @param start  开始时间。
     * @param end    结束时间。
     * @param field  该字段使用 {@link java.util.Calendar} 的字段，将 start 设为该字段的开始时间， end 设为该字段的结束时间进行查询。
     *               例如：当 start 为 2019-1-23 12:34:56.789，end 为 2019-12-11 10:09:09.876，field 为 {@link java.util.Calendar#DATE} 时，
     *               start 设为 2019-1-23 0:0:0.0，end 设为 2019-12-11 23:59:59.999。
     * @return 返回获得的数据链表。
     * @author BAIYEQIYA
     */
    List<T> listBetween(String column, long start, long end, int field);

    /**
     * 根据数据范围查询数据。
     *
     * @param column 需要筛选的字段名称。
     * @param start  开始时间。
     * @param end    结束时间。
     * @return 返回获得的数据链表。
     * @author BAIYEQIYA
     */
    List<T> listBetween(String column, long start, long end);
}
