package com.mf.duomybatis.mapper1;

import com.mf.duomybatis.domain.Jduser;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JdUserMapper {

    @Select("select * from jduser")
    List<Jduser> selectList();

}
