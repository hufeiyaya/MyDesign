package com.example.demo.strategypattern.service.impl;

import com.example.demo.strategypattern.service.IStrategy;

public class BlockEnemy implements IStrategy{

	@Override
	public void operate() {
		// TODO Auto-generated method stub
		System.out.println("孙夫人阻拦追兵！");
	}

}
