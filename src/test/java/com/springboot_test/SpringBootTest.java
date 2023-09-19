package com.springboot_test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringBootTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringBootTest.class);

        User user = (User) context.getBean("user");

        System.out.println(user.getClass());
        user.app.onHold();
//        user.app.onRightSwipe();
//        user.app.onClick();

    }
}
