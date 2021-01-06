package com;

import com.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WebConfig.class);
        System.out.println("容器创建完毕");
        User user1 = context.getBean(User.class);
        User user2 = context.getBean(User.class);
        System.out.println(user1==user2);
    }
}
