package com.adrian.onlinejudgebackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication//(exclude = {RedisAutoConfiguration.class})
@MapperScan("com.adrian.onlinejudgebackenduserservice.mapper")
@EnableScheduling
@ComponentScan("com.adrian")
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class OnlineJudgeBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineJudgeBackendUserServiceApplication.class, args);
    }

}
