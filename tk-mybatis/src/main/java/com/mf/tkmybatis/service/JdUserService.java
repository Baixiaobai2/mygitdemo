package com.mf.tkmybatis.service;

import com.mf.tkmybatis.domain.Jduser;
import com.mf.tkmybatis.mapper.JdUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JdUserService {
    @Autowired
    private JdUserMapper jdUserMapper;

    public List<Jduser> selectList(){
        return jdUserMapper.selectAll();
    }

    public Jduser selectOne1(){

        return jdUserMapper.selectOne1();
    }

}
