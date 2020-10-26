package com.example.demo.buildpattern.impl;


import com.example.demo.buildpattern.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
