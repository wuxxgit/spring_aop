package com.wuxingxing.dao.impl;

import com.wuxingxing.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component(value = "userDao")//定义bean扫描
@Repository(value = "userDao")//Component衍生注解，用在DAO层，作用与@Component一样
@Scope(value = "singleton")//定义bean的作用范围
@Lazy(value = true)//定义bean的延迟加载
public class UserDaoImpl implements UserDao {
//    @Value("张三")
    @Value("${jdbc.username}")
    private String name;
    public void show(){
        System.out.println(name);
    }

    public UserDaoImpl() {
        System.out.println("执行无参构造");
    }
    //@PostConstruct定义bean的初始化方法
    @PostConstruct
    public void init(){
        System.out.println("初始化方法");
    }
    //@PreDestroy定义bean的销毁方法
    @PreDestroy
    public void destroy(){
        System.out.println("销毁方法");
    }
}
