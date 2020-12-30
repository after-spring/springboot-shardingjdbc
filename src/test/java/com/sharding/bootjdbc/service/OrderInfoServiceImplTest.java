package com.sharding.bootjdbc.service;

import com.sharding.bootjdbc.BaseTest;
import com.sharding.bootjdbc.entity.OrderInfo;
import com.sharding.bootjdbc.service.impl.OrderInfoServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class OrderInfoServiceImplTest extends BaseTest {
    @Autowired
    private OrderInfoServiceImpl orderInfoService;

    @Test
    public void save() {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setPrice(new BigDecimal(1));
        orderInfo.setStatus("success");
        orderInfo.setUserId(1L);
        orderInfoService.save(orderInfo);
    }
}
