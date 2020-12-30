package com.sharding.bootjdbc.mapper;

import com.sharding.bootjdbc.BaseTest;
import com.sharding.bootjdbc.entity.OrderInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: boot-jdbc
 * @description:
 * @author: sch
 * @create: 2020-12-30 16:03
 **/
public class OrderInfoMapperTest extends BaseTest {
    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Test
    public void testSelectAll() {
        List<OrderInfo> orderInfos = orderInfoMapper.selectAll();
        System.out.println("总数：" + orderInfos.size());
    }
}
