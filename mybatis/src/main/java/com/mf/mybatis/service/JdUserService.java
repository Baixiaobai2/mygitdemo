package com.mf.mybatis.service;

import com.mf.mybatis.dao.JdUserDao;
import com.mf.mybatis.domain.JdUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JdUserService {
    @Autowired
    private JdUserDao jdUserDao;

    public List<JdUser> selectList(){
        return jdUserDao.selectList();
    }

}
