package com.example.base.service.impl;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.base.dao.BaseDao;
import com.example.base.entity.BaseEntity;
import com.example.base.service.BaseService;
import org.springframework.util.Assert;

import java.sql.Timestamp;
import java.util.List;

/**
 * 基础 Service 实现类
 *
 * @author BAIYEQIYA
 * @version 1.0.0
 * @date 2018/5/10 11:25
 * @since JDK 1.8
 */
public class BaseServiceImpl<M extends BaseDao<T>, T extends BaseEntity> extends ServiceImpl<M, T> implements
        BaseService<T> {

    private M baseDao;

    public BaseServiceImpl(M baseDao) {
        Assert.notNull(baseDao, "baseDao 不能为 null");
        this.baseDao = baseDao;
    }

    @Override
    public boolean insertAllColumn(T entity) {
        setTime(entity, new Timestamp(System.currentTimeMillis()));
        return super.insertAllColumn(entity);
    }

    @Override
    public List<T> listBetween(String column, long start, long end, int field) {
        return null;
    }

    @Override
    public List<T> listBetween(String column, long start, long end) {
        return null;
    }

    @Override
    public boolean insertOrUpdateBatch(List<T> entityList) {
        if (0 == entityList.size()) {
            return true;
        }
        setTime(entityList, new Timestamp(System.currentTimeMillis()));
        return super.insertOrUpdateBatch(entityList);
    }

    public BaseServiceImpl() {
        super();
    }

    @Override
    public boolean insert(T entity) {
        setTime(entity, new Timestamp(System.currentTimeMillis()));
        return super.insert(entity);
    }

    @Override
    public boolean insertBatch(List<T> entityList) {
        if(0 == entityList.size()){
            return true;
        }
        setTime(entityList,new Timestamp(System.currentTimeMillis()));
        return super.insertBatch(entityList);
    }

    @Override
    public boolean insertBatch(List<T> entityList, int batchSize) {
        if(0 == entityList.size()){
            return true;
        }
        setTime(entityList,new Timestamp(System.currentTimeMillis()));
        return super.insertBatch(entityList, batchSize);
    }

    @Override
    public boolean insertOrUpdate(T entity) {
        setTime(entity,new Timestamp(System.currentTimeMillis()));
        return super.insertOrUpdate(entity);
    }

    @Override
    public boolean insertOrUpdateAllColumn(T entity) {
        setTime(entity,new Timestamp(System.currentTimeMillis()));
        return super.insertOrUpdateAllColumn(entity);
    }

    @Override
    public boolean insertOrUpdateBatch(List<T> entityList, int batchSize) {
        if(0 == entityList.size()){
            return true;
        }
        setTime(entityList,new Timestamp(System.currentTimeMillis()));
        return super.insertOrUpdateBatch(entityList, batchSize);
    }

    @Override
    public boolean insertOrUpdateAllColumnBatch(List<T> entityList) {
        if(0 == entityList.size()){
            return true;
        }
        setTime(entityList,new Timestamp(System.currentTimeMillis()));
        return super.insertOrUpdateAllColumnBatch(entityList);
    }

    @Override
    public boolean insertOrUpdateAllColumnBatch(List<T> entityList, int batchSize) {
        if(0 == entityList.size()){
            return true;
        }
        setTime(entityList,new Timestamp(System.currentTimeMillis()));
        return super.insertOrUpdateAllColumnBatch(entityList, batchSize);
    }


    @Override
    public boolean updateById(T entity) {
        setTime(entity,new Timestamp(System.currentTimeMillis()));
        return super.updateById(entity);
    }

    @Override
    public boolean updateAllColumnById(T entity) {
        setTime(entity,new Timestamp(System.currentTimeMillis()));
        return super.updateAllColumnById(entity);
    }

    @Override
    public boolean update(T entity, Wrapper<T> wrapper) {
        setTime(entity,new Timestamp(System.currentTimeMillis()));
        return super.update(entity, wrapper);
    }

    @Override
    public boolean updateBatchById(List<T> entityList) {
        if(0 == entityList.size()){
            return true;
        }
        setTime(entityList,new Timestamp(System.currentTimeMillis()));
        return super.updateBatchById(entityList);
    }

    @Override
    public boolean updateBatchById(List<T> entityList, int batchSize) {
        if(0 == entityList.size()){
            return true;
        }
        setTime(entityList,new Timestamp(System.currentTimeMillis()));
        return super.updateBatchById(entityList, batchSize);
    }

    @Override
    public boolean updateAllColumnBatchById(List<T> entityList) {
        if(0 == entityList.size()){
            return true;
        }
        setTime(entityList,new Timestamp(System.currentTimeMillis()));
        return super.updateAllColumnBatchById(entityList);
    }

    @Override
    public boolean updateAllColumnBatchById(List<T> entityList, int batchSize) {
        if(0 == entityList.size()){
            return true;
        }
        setTime(entityList,new Timestamp(System.currentTimeMillis()));
        return super.updateAllColumnBatchById(entityList, batchSize);
    }
    /**
     * 设置创建时间和更新时间，如果已有创建时间则只设置更新时间。
     *
     * @param entity    实体对象。
     * @param timestamp 将该时间设为创建时间和更新时间。
     * @author BAIYEQIYA
     */
    private void setTime(T entity, Timestamp timestamp) {
        if (null == entity.getGmtCreate()) {
            entity.setGmtCreate(timestamp);
        }
        entity.setGmtModified(timestamp);
    }

    /**
     * 设置创建时间和更新时间，如果已有创建时间则只设置更新时间。
     *
     * @param entityList 实体对象链表。
     * @param timestamp  将该时间设为创建时间和更新时间。
     * @author BAIYEQIYA
     */
    private void setTime(List<T> entityList, Timestamp timestamp) {
        for (T entity : entityList) {
            setTime(entity, timestamp);
        }
    }

    public M getBaseDao() {
        return baseDao;
    }

    public void setBaseDao(M baseDao) {
        this.baseDao = baseDao;
    }
}
