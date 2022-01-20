package com.nmcc.fegin;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(url = "127.0.0.1:80", name = "cloud-eureka")
public interface EurekaClient {


    @RequestMapping(value="/getHome",method= RequestMethod.GET)
    String getHome();
}
