package com.mf.filterandinterceptor.config;

import com.mf.filterandinterceptor.filter.TestFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    public FilterRegistrationBean<TestFilter> getFilterRegistrationBean(){
        FilterRegistrationBean<TestFilter> filterRegistrationBean=new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new TestFilter());
        filterRegistrationBean.addUrlPatterns("/**");
//        filterRegistrationBean.setOrder(0);
        return filterRegistrationBean;
    }

}
