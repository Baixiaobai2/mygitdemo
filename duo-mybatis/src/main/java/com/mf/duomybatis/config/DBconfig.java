package com.mf.duomybatis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DBconfig {

    @Bean("db1")
    @ConfigurationProperties(prefix = "spring.datasource.db1")
    public DataSource getDataSource1(){
        return DataSourceBuilder.create().build();
    }

    @Bean("db2")
    @ConfigurationProperties(prefix = "spring.datasource.db2")
    public DataSource getDataSource2(){
        return DataSourceBuilder.create().build();
    }

}
