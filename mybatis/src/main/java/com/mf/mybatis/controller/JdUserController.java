package com.mf.mybatis.controller;

import com.mf.mybatis.domain.JdUser;
import com.mf.mybatis.service.JdUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JdUserController {
    @Autowired
    private JdUserService jdUserService;

    @RequestMapping("/selectList")
    public String selectList(Model model){
        List<JdUser> list=jdUserService.selectList();
        model.addAttribute("list",list);
        return "list";
    }

}
