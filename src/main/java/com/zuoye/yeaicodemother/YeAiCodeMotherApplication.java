package com.zuoye.yeaicodemother;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class YeAiCodeMotherApplication {

    public static void main(String[] args) {
        SpringApplication.run(YeAiCodeMotherApplication.class, args);
    }

}
