package com.springboot_test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("flipkart")
public class Flipkart implements ShoppingApp{
    public Flipkart() {
        System.out.println("Flipkart Constructor");
    }

    @Override
    public void onHold() {
        System.out.println("Flipkart Discount Coupon");
    }

    @Override
    public void onRightSwipe() {
        System.out.println("Flipkart Added To Cart");
    }

    @Override
    public void onClick() {
        System.out.println("Flipkart Product Description");
    }
}
