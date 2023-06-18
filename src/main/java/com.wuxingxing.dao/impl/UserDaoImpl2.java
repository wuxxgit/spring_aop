package com.wuxingxing.dao.impl;

import com.wuxingxing.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository(value = "userDao2")//Component衍生注解，用在DAO层，作用与@Component一样
public class UserDaoImpl2 implements UserDao {

    public void show(){
        System.out.println("执行UserDaoImpl2的show方法");
    }

}
