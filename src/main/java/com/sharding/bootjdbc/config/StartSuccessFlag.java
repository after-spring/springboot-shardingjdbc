package com.sharding.bootjdbc.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @program: boot-jdbc
 * @description:
 * @author: sch
 * @create: 2020-12-29 14:08
 **/
@Component
public class StartSuccessFlag implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("this app start success...");
    }
}
