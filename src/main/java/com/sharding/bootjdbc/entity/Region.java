package com.sharding.bootjdbc.entity;

import javax.persistence.*;

public class Region {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 地理区域编码
     */
    @Column(name = "region_code")
    private String regionCode;

    /**
     * 地理区域名称
     */
    @Column(name = "region_name")
    private String regionName;

    /**
     * 地理区域级别(省、市、县)
     */
    private Boolean level;

    /**
     * 上级地理区域编码
     */
    @Column(name = "parent_region_code")
    private String parentRegionCode;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取地理区域编码
     *
     * @return region_code - 地理区域编码
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * 设置地理区域编码
     *
     * @param regionCode 地理区域编码
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }

    /**
     * 获取地理区域名称
     *
     * @return region_name - 地理区域名称
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * 设置地理区域名称
     *
     * @param regionName 地理区域名称
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    /**
     * 获取地理区域级别(省、市、县)
     *
     * @return level - 地理区域级别(省、市、县)
     */
    public Boolean getLevel() {
        return level;
    }

    /**
     * 设置地理区域级别(省、市、县)
     *
     * @param level 地理区域级别(省、市、县)
     */
    public void setLevel(Boolean level) {
        this.level = level;
    }

    /**
     * 获取上级地理区域编码
     *
     * @return parent_region_code - 上级地理区域编码
     */
    public String getParentRegionCode() {
        return parentRegionCode;
    }

    /**
     * 设置上级地理区域编码
     *
     * @param parentRegionCode 上级地理区域编码
     */
    public void setParentRegionCode(String parentRegionCode) {
        this.parentRegionCode = parentRegionCode == null ? null : parentRegionCode.trim();
    }
}