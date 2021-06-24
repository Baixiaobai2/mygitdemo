package com.mf.oracle.mapper;

import com.mf.oracle.domain.Mytest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

//@Repository
//@Mapper
public interface MyTestMapper extends tk.mybatis.mapper.common.Mapper<Mytest> {

//    @Select("select * from mytest where name=\'baibai\'")
//    Mytest selectOne();

}
