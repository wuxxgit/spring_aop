package com.wuxingxing.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration//标志当前类是配置类（替代applicationContext.xml配置文件）+@Component
//<context:component-scan base-package="com/wuxingxing"></context:component-scan>
@ComponentScan("com/wuxingxing")
//<context:property-placeholder location="jdbc.properties"></context:property-placeholder>
@PropertySource("jdbc.properties")
public class SpringConfig {

}
