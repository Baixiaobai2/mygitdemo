package com.mf.duomybatis.service;

import com.mf.duomybatis.domain.Jduser;
import com.mf.duomybatis.mapper1.JdUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JdUserService {
    @Autowired
    private JdUserMapper jdUserMapper;

    public List<Jduser> selectList(){
        return jdUserMapper.selectList();
    }

}
