package com.example.base.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 基础 Entity
 *
 * @author BAIYEQIYA
 * @version 1.0.0
 * @date 2018/5/10 11:30
 * @since JDK 1.8
 */
public class BaseEntity implements Serializable {

    /**
     * 创建时间
     */
    protected Timestamp gmtCreate;

    /**
     * 更新时间
     */
    protected Timestamp gmtModified;

    public BaseEntity() {
    }

    public Timestamp getGmtCreate() {
        if (null == gmtCreate) {
            return null;
        }
        return new Timestamp(gmtCreate.getTime());
    }

    public void setGmtCreate(Timestamp gmtCreate) {
        if (null == gmtCreate) {
            return;
        }
        this.gmtCreate = new Timestamp(gmtCreate.getTime());
    }

    public Timestamp getGmtModified() {
        if (null == gmtModified) {
            return null;
        }
        return new Timestamp(gmtModified.getTime());
    }

    public void setGmtModified(Timestamp gmtModified) {
        if (null == gmtModified) {
            return;
        }
        this.gmtModified = new Timestamp(gmtModified.getTime());
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }
}
