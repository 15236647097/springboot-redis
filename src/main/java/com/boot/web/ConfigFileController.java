package com.boot.web;

import com.boot.entry.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//javaBean读取配置文件时需在启动类或应用类上加上此注解，多个JavaBean时以,隔开
@EnableConfigurationProperties({ConfigBean.class})
public class ConfigFileController {
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;
    @Autowired
    private ConfigBean configBean;

    //读取配置文件参数
    @RequestMapping(value = "/configFile")
    public String configFile() {
        return name + ":" + age;
    }

    //javaBean读取配置文件参数
    @RequestMapping(value = "/configBean")
    public String configBean(){
        return configBean.getGreeting()+" >>>>"+configBean.getName()+" >>>>"+ configBean.getUuid()+" >>>>"+configBean.getMax();
    }
}
