package com.mf.oracle.controller;

import com.mf.oracle.domain.Mytest;
import com.mf.oracle.service.MyTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyTestController {
    @Autowired
    private MyTestService myTestService;
    @RequestMapping("/selectList")
    public List<Mytest> selectList(){
        return myTestService.selectList();
    }

//    @RequestMapping("/selectOne")
//    public Mytest selectOne(){
//        return myTestService.selectOne();
//    }

}
