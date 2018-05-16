package com.example.bin.entity;

import java.util.Date;

/**
 * Air Sensor 实体类
 *
 * @author Lu
 * @date 2018-05-11 12:59:27
 */
public class AirSensor {

    private Long id;

    /**
     * 设备DUID
     */
    private Long duid;
    /**
     * 采集时间
     */
    private Date collectionTime;
    /**
     * 采集方式（0:设备采集 1:人工采集）
     */
    private Boolean collectionMethod;
    /**
     * CO质量浓度(mg/m3)
     */
    private Integer massConcentration;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 更新时间
     */
    private Date gmtModified;

    @Override
    public String toString() {
        return "AirSensor{" + "id=" + id + ", duid=" + duid + ", collectionTime=" + collectionTime + ", collectionMethod=" + collectionMethod + ", massConcentration=" + massConcentration + ", gmtCreate=" + gmtCreate + ", gmtModified=" + gmtModified + '}';
    }

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 设备DUID
     *
     * @return duid 设备DUID
     */
    public Long getDuid() {
        return duid;
    }

    /**
     * 设备DUID
     *
     * @param duid 设备DUID
     */
    public void setDuid(Long duid) {
        this.duid = duid;
    }

    /**
     * 采集时间
     *
     * @return collection_time 采集时间
     */
    public Date getCollectionTime() {
        return collectionTime;
    }

    /**
     * 采集时间
     *
     * @param collectionTime 采集时间
     */
    public void setCollectionTime(Date collectionTime) {
        this.collectionTime = collectionTime;
    }

    /**
     * 采集方式（0:设备采集 1:人工采集）
     *
     * @return collection_method 采集方式（0:设备采集 1:人工采集）
     */
    public Boolean getCollectionMethod() {
        return collectionMethod;
    }

    /**
     * 采集方式（0:设备采集 1:人工采集）
     *
     * @param collectionMethod 采集方式（0:设备采集 1:人工采集）
     */
    public void setCollectionMethod(Boolean collectionMethod) {
        this.collectionMethod = collectionMethod;
    }

    /**
     * CO质量浓度(mg/m3)
     *
     * @return mass_concentration CO质量浓度(mg/m3)
     */
    public Integer getMassConcentration() {
        return massConcentration;
    }

    /**
     * CO质量浓度(mg/m3)
     *
     * @param massConcentration CO质量浓度(mg/m3)
     */
    public void setMassConcentration(Integer massConcentration) {
        this.massConcentration = massConcentration;
    }

    /**
     * 创建时间
     *
     * @return gmt_create 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 创建时间
     *
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 更新时间
     *
     * @return gmt_modified 更新时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 更新时间
     *
     * @param gmtModified 更新时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}