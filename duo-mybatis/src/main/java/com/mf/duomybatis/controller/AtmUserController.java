package com.mf.duomybatis.controller;

import com.mf.duomybatis.domain.User;
import com.mf.duomybatis.service.AtmUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@RestController
//@Api 声明一系列接口的功能   放在controller之上
@Api(tags = "相关接口",description = "增删改查的接口")
public class AtmUserController {
    @Autowired
    private AtmUserService atmUserService;

    /**
     * @ApiOperation
     * 声明具体接口的功能  放在controller的方法之上
     */
    @ApiOperation("查询全部atm用户")
    @GetMapping("/selectList2")
    public List<User> selectList(){
        return atmUserService.selectList();
    }

    /**
     * @ApiIgnore
     * 不显示此接口
     */
//    @ApiIgnore

    @ApiOperation("删除嘉宾接口")
    @ApiImplicitParam(name = "name",value = "姓名")
    @GetMapping("/selectOne/{name}")
    public User selectOne(@PathVariable("name") String name){
        return atmUserService.selectOne(name);
    }

}
