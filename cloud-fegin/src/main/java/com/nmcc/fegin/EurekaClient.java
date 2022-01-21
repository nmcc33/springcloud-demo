package com.nmcc.fegin;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(url = "${eureka.url}", name = "cloud-eureka")
public interface EurekaClient {


    @RequestMapping(value="/getHome",method= RequestMethod.GET)
    String getHome();
}
