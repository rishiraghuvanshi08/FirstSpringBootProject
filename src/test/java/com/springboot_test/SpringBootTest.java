package com.springboot_test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
@ComponentScan
public class SpringBootTest {
    @Bean("date1")
    public Date getDate(){
        System.out.println("Inside Date");
        return new Date();
    }
    @Bean("date2")
    public Date getDate2(){
        System.out.println("Inside Date 2");
        return new Date();
    }
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringBootTest.class);

        User user = (User) context.getBean("user");

        System.out.println(user.getClass());
        user.app.onHold();
//        user.app.onRightSwipe();
//        user.app.onClick();

        // Using Bean
        Date currDate = context.getBean("date2", Date.class);
        System.out.println(currDate);

    }
}
