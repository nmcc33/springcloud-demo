package com.nmcc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeginApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(FeginApplication.class).web(true).run(args);
    }
}
