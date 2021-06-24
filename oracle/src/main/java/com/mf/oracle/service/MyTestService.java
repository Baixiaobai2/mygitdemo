package com.mf.oracle.service;

import com.mf.oracle.domain.Mytest;
import com.mf.oracle.mapper.MyTestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyTestService {
    @Autowired
    private MyTestMapper myTestMapper;

    public List<Mytest> selectList(){
        return myTestMapper.selectAll();
    }

//    public Mytest selectOne(){
//        return myTestMapper.selectOne();
//    }

}
