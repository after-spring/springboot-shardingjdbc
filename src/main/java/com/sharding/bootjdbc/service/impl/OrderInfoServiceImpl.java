package com.sharding.bootjdbc.service.impl;

import com.sharding.bootjdbc.entity.OrderInfo;
import com.sharding.bootjdbc.mapper.OrderInfoMapper;
import com.sharding.bootjdbc.service.OrderInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: boot-jdbc
 * @description:
 * @author: sch
 * @create: 2020-12-29 20:39
 **/
@Service
@Slf4j
public class OrderInfoServiceImpl implements OrderInfoService {
    @Autowired
    private OrderInfoMapper orderInfoMapper;

    public int save(OrderInfo orderInfo) {
        return orderInfoMapper.insert(orderInfo);
    }
}
