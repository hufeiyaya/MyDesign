package com.example.demo.strategypattern.service.impl;

import com.example.demo.strategypattern.service.IStrategy;

public class BackDoor implements IStrategy{

	@Override
	public void operate() {
		// TODO Auto-generated method stub
		System.out.println("找乔国老帮忙，让吴国太给孙权压力！");
	}

}
