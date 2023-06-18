package com.wuxingxing.beans;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class OtherBean {

    @Bean("dataSource")//非自定义bean使用该注解，如果当前方法需要注入参数，可以在方法参数中直接使用注解注入，如果注入对象是通过类型注入，方法参数前面的@AutoWire可以省略
    public DataSource dataSource(@Value("${jdbc.username}") String username){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername(username);
        System.out.println(username);
        return druidDataSource;
    }
}
