package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserAutoWire {
    @Autowired
    IPhone iphone;

}
