package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserSetter {
    IPhone iphone;

    @Autowired
    @Qualifier("iphone10")
    public void setIphone(IPhone iphone) {
        this.iphone = iphone;
        System.out.println("Setter Injection");
    }
}
