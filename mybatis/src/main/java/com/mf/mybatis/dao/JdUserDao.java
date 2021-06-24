package com.mf.mybatis.dao;

import com.mf.mybatis.domain.JdUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
//方式一二
//@Mapper
//@Repository
public interface JdUserDao {

//    方式三
    @Select("select * from jduser")
    List<JdUser> selectList();

}
