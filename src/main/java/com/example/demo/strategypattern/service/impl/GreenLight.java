package com.example.demo.strategypattern.service.impl;

import com.example.demo.strategypattern.service.IStrategy;

public class GreenLight implements IStrategy{

	@Override
	public void operate() {
		// TODO Auto-generated method stub
		System.out.println("求吴国太，放行！");
	}

}
