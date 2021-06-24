package com.mf.duomybatis.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
@Configuration
@MapperScan(basePackages = "com.mf.duomybatis.mapper1",sqlSessionFactoryRef = "getSqlSessionFactory1")
public class DBoneConfig {

    @Autowired
    @Qualifier("db1")
    private DataSource dataSource;

    @Bean
//    @Qualifier("")自动为方法名
    public SqlSessionFactory getSqlSessionFactory1() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean=new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean.getObject();
    }
    @Bean
    public SqlSessionTemplate getSqlSessionTemplate1()throws Exception{
        return new SqlSessionTemplate(this.getSqlSessionFactory1());
    }

}
