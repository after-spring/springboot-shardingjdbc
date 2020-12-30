package com.sharding.bootjdbc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "t_order")
public class OrderInfo implements Serializable {
    /**
     * 订单id
     */
    @Id
    @Column(name = "order_id")
    private Long orderId;

    /**
     * 订单价格
     */
    private BigDecimal price;

    /**
     * 下单用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 订单状态
     */
    private String status;

    /**
     * 获取订单id
     *
     * @return order_id - 订单id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id
     *
     * @param orderId 订单id
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取订单价格
     *
     * @return price - 订单价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置订单价格
     *
     * @param price 订单价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取下单用户id
     *
     * @return user_id - 下单用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置下单用户id
     *
     * @param userId 下单用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取订单状态
     *
     * @return status - 订单状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置订单状态
     *
     * @param status 订单状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}