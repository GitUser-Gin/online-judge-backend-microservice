package com.adrian.onlinejudgequestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication//(exclude = {RedisAutoConfiguration.class})
@MapperScan("com.adrian.onlinejudgequestionservice.mapper")
@EnableScheduling
@ComponentScan("com.adrian")
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class OnlineJudgeQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineJudgeQuestionServiceApplication.class, args);
    }

}
