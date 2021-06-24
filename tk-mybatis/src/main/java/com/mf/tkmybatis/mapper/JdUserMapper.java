package com.mf.tkmybatis.mapper;

import com.mf.tkmybatis.domain.Jduser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JdUserMapper extends BaseMapper<Jduser> {

//    实体类名为JdUser，tkmybatis框架自动创建表jd_user
//    实体类名为Jduser，tkmybatis框架自动创建表jduser


    Jduser selectOne1();

}
