package com.example.demo.buildpattern;

import com.example.demo.build.impl.Bottle;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
