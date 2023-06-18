package com.wuxingxing.service.impl;

import com.wuxingxing.dao.UserDao;
import com.wuxingxing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

//@Component
@Service(value = "userService")//Component衍生注解，用在Service层，作用与@Component一样,@Controller用在WEB层类上，@Repository用在DAO层，其它层的可以用@Component
public class UserServiceImpl implements UserService {
    /**
     * 这三个属性注解常用Autowired
     */

    @Autowired//根据类型注入,如果容器中同一类型的bean有多个，则会尝试用名字进行二次匹配，匹配不成功则报错
    @Qualifier("userDao2")//配合 @Autowired一起使用，根据名称注入相应的bean
    private UserDao userDao;

    @Resource(name = "userDao")//不指定名称参数，根据类型注入，指定名称就根据名称注入
    private UserDao userDao1;

    public void show() {
        System.out.println(userDao);
    }

    @Autowired
    public void xxx(UserDao userDao){
        System.out.println("xxx:"+userDao);
    }
    @Autowired 
    public void yyy(List<UserDao> list){//从容器中将所有UserDao类型的bean放到集合中
        System.out.println("yyy:"+list);
    }
}
