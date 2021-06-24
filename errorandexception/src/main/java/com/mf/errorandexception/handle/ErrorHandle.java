package com.mf.errorandexception.handle;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
@ControllerAdvice
public class ErrorHandle {

    @ExceptionHandler(Exception.class)
    public ModelAndView myErrorHandle(Exception e){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/error");
        modelAndView.addObject("message",e.getMessage());
        return  modelAndView;
    }

}
