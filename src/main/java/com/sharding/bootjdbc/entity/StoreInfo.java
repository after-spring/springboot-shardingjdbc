package com.sharding.bootjdbc.entity;

import javax.persistence.*;

@Table(name = "store_info")
public class StoreInfo {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 店铺名称
     */
    @Column(name = "store_name")
    private String storeName;

    /**
     * 信誉等级
     */
    private Integer reputation;

    /**
     * 店铺所在地
     */
    @Column(name = "region_code")
    private String regionCode;

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
     * 获取店铺名称
     *
     * @return store_name - 店铺名称
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * 设置店铺名称
     *
     * @param storeName 店铺名称
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    /**
     * 获取信誉等级
     *
     * @return reputation - 信誉等级
     */
    public Integer getReputation() {
        return reputation;
    }

    /**
     * 设置信誉等级
     *
     * @param reputation 信誉等级
     */
    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }

    /**
     * 获取店铺所在地
     *
     * @return region_code - 店铺所在地
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * 设置店铺所在地
     *
     * @param regionCode 店铺所在地
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }
}