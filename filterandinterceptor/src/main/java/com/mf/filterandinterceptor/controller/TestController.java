package com.mf.filterandinterceptor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/servlet")
    public String servlet(){
        return "hello servlet";
    }

}
