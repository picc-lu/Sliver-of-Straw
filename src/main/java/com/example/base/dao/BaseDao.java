package com.example.base.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.base.entity.BaseEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 基础 DAO。
 *
 * @author BAIYEQIYA
 * @version 1.0.0
 * @date 2018/5/10 11:29
 * @since JDK 1.8
 */
@Mapper
public interface BaseDao<T extends BaseEntity> extends BaseMapper<T> {
}
