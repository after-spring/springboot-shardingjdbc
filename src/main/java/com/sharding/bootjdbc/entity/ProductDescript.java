package com.sharding.bootjdbc.entity;

import javax.persistence.*;

@Table(name = "product_descript_1")
public class ProductDescript {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 所属商品id
     */
    @Column(name = "product_info_id")
    private Long productInfoId;

    /**
     * 所属店铺id
     */
    @Column(name = "store_info_id")
    private Long storeInfoId;

    /**
     * 商品描述
     */
    private String descript;

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
     * 获取所属商品id
     *
     * @return product_info_id - 所属商品id
     */
    public Long getProductInfoId() {
        return productInfoId;
    }

    /**
     * 设置所属商品id
     *
     * @param productInfoId 所属商品id
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
     * 获取商品描述
     *
     * @return descript - 商品描述
     */
    public String getDescript() {
        return descript;
    }

    /**
     * 设置商品描述
     *
     * @param descript 商品描述
     */
    public void setDescript(String descript) {
        this.descript = descript == null ? null : descript.trim();
    }
}