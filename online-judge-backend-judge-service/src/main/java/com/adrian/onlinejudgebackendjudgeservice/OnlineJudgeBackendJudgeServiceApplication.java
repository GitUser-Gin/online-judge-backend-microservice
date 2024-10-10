package com.adrian.onlinejudgebackendjudgeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication//(exclude = {RedisAutoConfiguration.class})
@EnableScheduling
@ComponentScan("com.adrian")
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class OnlineJudgeBackendJudgeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineJudgeBackendJudgeServiceApplication.class, args);
    }

}
