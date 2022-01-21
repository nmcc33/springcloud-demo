package com.nmcc;

import com.nmcc.fegin.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/getHome")
    public String getHome(){
        return eurekaClient.getHome();
    }
}
