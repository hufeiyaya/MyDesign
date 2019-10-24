package com.example.demo.strategypattern.contro;

import com.example.demo.strategypattern.service.IStrategy;

public class Context {
	private IStrategy iStrategy;

	/**
	 * 获取相应计谋的实现接口
	 * @param iStrategy
	 */
	public Context(IStrategy iStrategy) {
		this.iStrategy = iStrategy;
	}
	
	/**
	 * 使用相应计谋
	 */
	public void operater()
	{
		this.iStrategy.operate();
	}
}
