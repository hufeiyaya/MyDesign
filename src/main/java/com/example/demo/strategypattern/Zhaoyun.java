package com.example.demo.strategypattern;

import com.example.demo.strategypattern.controller.Context;
import com.example.demo.strategypattern.service.impl.BackDoor;
import com.example.demo.strategypattern.service.impl.BlockEnemy;
import com.example.demo.strategypattern.service.impl.GreenLight;

public class Zhaoyun {
	public static void main(String[] args) {
		Context context;
		System.out.println("------到了吴国拆开第一个-------");
		context = new Context(new BackDoor());
		context.operater();
		System.out.println("");
		
		System.out.println("------刘备乐不思蜀 拆第二个-------");
		context = new Context(new GreenLight());
		context.operater();
		System.out.println("");
		
		System.out.println("------孙权追兵到了，拆第三个-------");
		context = new Context(new BlockEnemy());
		context.operater();
		System.out.println("");
	}
}
