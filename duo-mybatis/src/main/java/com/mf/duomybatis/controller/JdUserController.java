package com.mf.duomybatis.controller;

import com.mf.duomybatis.domain.Jduser;
import com.mf.duomybatis.service.JdUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JdUserController {
    @Autowired
    private JdUserService jdUserService;
    @RequestMapping("/selectList1")
    public List<Jduser> selectList(){
        return jdUserService.selectList();
    }

}
