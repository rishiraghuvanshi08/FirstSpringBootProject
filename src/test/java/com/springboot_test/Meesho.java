package com.springboot_test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("meesho")
public class Meesho implements ShoppingApp{
    public Meesho() {
        System.out.println("Meesho Constructor");
    }

    @Override
    public void onHold() {
        System.out.println("Meesho Picture Display");
    }

    @Override
    public void onRightSwipe() {
        System.out.println("Meesho Description");
    }

    @Override
    public void onClick() {
        System.out.println("Meesho Checkout");
    }
}
