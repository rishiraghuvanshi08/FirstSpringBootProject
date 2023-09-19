package com.springboot_test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("amazon")
public class Amazon implements ShoppingApp{
    public Amazon() {
        System.out.println("Amazon Constructor");
    }

    @Override
    public void onHold() {
        System.out.println("Amazon Price Display");
    }

    @Override
    public void onRightSwipe() {
        System.out.println("Amazon Similar Products");
    }

    @Override
    public void onClick() {
        System.out.println("Amazon Booked and Redirecting on Payment");
    }
}
