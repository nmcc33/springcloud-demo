package com.eureka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class DemoController {


    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("getHome")
    public String getHome() {
        return "message hehe: " + serverPort;
    }
}
