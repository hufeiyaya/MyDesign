package com.example.demo.buildpattern;


import com.example.demo.buildpattern.impl.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
