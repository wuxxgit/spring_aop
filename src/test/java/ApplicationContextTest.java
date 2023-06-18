import com.wuxingxing.config.SpringConfig;
import com.wuxingxing.dao.UserDao;
import com.wuxingxing.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class ApplicationContextTest {

    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.show();
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.show();
    }

    @Test
    public void test02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        System.out.println(dataSource);
    }

    @Test
    public void test03(){
        //注解方式加载核心配置类
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        System.out.println(userDao);

    }
}
