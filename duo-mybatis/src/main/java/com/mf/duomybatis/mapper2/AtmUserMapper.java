package com.mf.duomybatis.mapper2;

import com.mf.duomybatis.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AtmUserMapper {

    @Select("select * from user")
    List<User> selectList();

    @Select("select * from user where name=#{name}")
    User selectOne(String name);

}
