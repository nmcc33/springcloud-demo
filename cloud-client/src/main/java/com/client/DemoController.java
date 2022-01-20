package com.client;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class DemoController implements InitializingBean {

    @Value("${zookeeper.server}")
    private String message;

    @RequestMapping("printMessage")
    public String printMessage() {
        System.out.println(message);
        return message;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(message);
    }

    @RequestMapping("getHome")
    public String getHome() {
        System.out.println(message);
        return message;
    }
}
