package com.springboot_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Autowired
    @Qualifier("amazon")
    ShoppingApp app;

    @Autowired
    public User(@Qualifier("flipkart") ShoppingApp app) {
        System.out.println("Constructor injection");
        this.app = app;
        this.app.onHold();
    }

    @Autowired
    @Qualifier("meesho")
    public void setApp(ShoppingApp app) {
        System.out.println("Setter Injection");
//        this.app = app;
    }
}
