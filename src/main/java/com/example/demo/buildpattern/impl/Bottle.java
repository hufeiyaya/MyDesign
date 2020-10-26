package com.example.demo.buildpattern.impl;


import com.example.demo.buildpattern.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
