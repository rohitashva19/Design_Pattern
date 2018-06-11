package com.letsLearn.designPatterns.behavioral.strategyPattern;

public class Duck extends Animal{

	public Duck(){
		super();
		setName("Duck");
		setFood("insects");
		setSound("quack");
		setSpeed(5.00);
		
		flyingType = new ItFlys();
	}
}
