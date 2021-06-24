package com.mf.duomybatis.service;

import com.mf.duomybatis.domain.User;
import com.mf.duomybatis.mapper2.AtmUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtmUserService {
    @Autowired
    private AtmUserMapper atmUserMapper;

    public List<User> selectList(){
        return atmUserMapper.selectList();
    }

    public User selectOne(String name){
        return atmUserMapper.selectOne(name);
    }


}
