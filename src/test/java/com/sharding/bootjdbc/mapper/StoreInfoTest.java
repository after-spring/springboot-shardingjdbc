package com.sharding.bootjdbc.mapper;

import com.sharding.bootjdbc.BaseTest;
import com.sharding.bootjdbc.entity.StoreInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: springboot-shardingjdbc
 * @description:
 * @author: sch
 * @create: 2021-01-04 21:57
 **/
public class StoreInfoTest extends BaseTest {
    @Autowired
    private StoreInfoMapper storeInfoMapper;

    @Test
    public void testCount() {
        List<StoreInfo> storeInfos = storeInfoMapper.selectAll();
        System.out.println("stor总数:" + storeInfos.size());
    }
}
