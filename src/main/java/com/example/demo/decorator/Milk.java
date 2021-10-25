package com.example.demo.decorator;

import com.example.demo.decorator.Beverage;

public class Milk implements Beverage {
    @Override
    public String getName() {
        return "우유";
    }

    @Override
    public int getPrice() {
        return 1500;
    }
}
