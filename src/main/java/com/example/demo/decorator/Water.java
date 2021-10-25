package com.example.demo.decorator;

import com.example.demo.decorator.Beverage;

public class Water implements Beverage {
    @Override
    public String getName() {
        return "물";
    }

    @Override
    public int getPrice() {
        return 1000;
    }
}
