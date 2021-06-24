package com.mf.tkmybatis.controller;

import com.mf.tkmybatis.domain.Jduser;
import com.mf.tkmybatis.service.JdUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JdUserController {
    @Autowired
    private JdUserService jdUserService;
    @RequestMapping("/selectList")
    public String selectList(Model model){
        model.addAttribute("list",jdUserService.selectList());
        return "list";
    }
    @RequestMapping("/selectOne")
    @ResponseBody
    public Jduser selectOne1(){
        return jdUserService.selectOne1();
    }

}
