package com.mf.errorandexception.controller;

import com.mf.errorandexception.bean.Test;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class TestController {

    //普通校验与springboot集成
    @RequestMapping("/test1")
    public String test1(@Valid Test test){
        return "putong";
    }

    //自定义与springboot集成
    @RequestMapping("/test2")
    public String test2(@Valid Test test, BindingResult result){
        if(result.getErrorCount()>0){
            List<FieldError> fieldErrorList = result.getFieldErrors();
            StringBuffer stringBuffer = new StringBuffer();
            for(FieldError fieldError : fieldErrorList){
                stringBuffer.append(fieldError.getField());
                stringBuffer.append("\t");
                stringBuffer.append(fieldError.getDefaultMessage());
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        }

        return "fastfail";
    }

    @RequestMapping("/testError")
    public String testError() throws Exception{
        throw new Exception("测试异常");
    }

}
