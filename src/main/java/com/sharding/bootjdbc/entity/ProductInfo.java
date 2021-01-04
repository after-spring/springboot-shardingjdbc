package com.sharding.bootjdbc.entity;

import javax.persistence.*;

@Table(name = "product_info_1")
public class ProductInfo {
    /**
     * id
     */
    @Id
    @Column(name = "product_info_id")
    private Long productInfoId;

    /**
     * 所属店铺id
     */
    @Column(name = "store_info_id")
    private Long storeInfoId;

    /**
     * 商品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 规
格
     */
    private String spec;

    /**
     * 产地
     */
    @Column(name = "region_code")
    private String regionCode;

    /**
     * 商品价格
     */
    private Long price;

    /**
     * 商品图片
     */
    @Column(name = "image_url")
    private String imageUrl;

    /**
     * 获取id
     *
     * @return product_info_id - id
     */
    public Long getProductInfoId() {
        return productInfoId;
    }

    /**
     * 设置id
     *
     * @param productInfoId id
     */
    public void setProductInfoId(Long productInfoId) {
        this.productInfoId = productInfoId;
    }

    /**
     * 获取所属店铺id
     *
     * @return store_info_id - 所属店铺id
     */
    public Long getStoreInfoId() {
        return storeInfoId;
    }

    /**
     * 设置所属店铺id
     *
     * @param storeInfoId 所属店铺id
     */
    public void setStoreInfoId(Long storeInfoId) {
        this.storeInfoId = storeInfoId;
    }

    /**
     * 获取商品名称
     *
     * @return product_name - 商品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置商品名称
     *
     * @param productName 商品名称
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * 获取规
格
     *
     * @return spec - 规
格
     */
    public String getSpec() {
        return spec;
    }

    /**
     * 设置规
格
     *
     * @param spec 规
格
     */
    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    /**
     * 获取产地
     *
     * @return region_code - 产地
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * 设置产地
     *
     * @param regionCode 产地
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }

    /**
     * 获取商品价格
     *
     * @return price - 商品价格
     */
    public Long getPrice() {
        return price;
    }

    /**
     * 设置商品价格
     *
     * @param price 商品价格
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * 获取商品图片
     *
     * @return image_url - 商品图片
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 设置商品图片
     *
     * @param imageUrl 商品图片
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }
}