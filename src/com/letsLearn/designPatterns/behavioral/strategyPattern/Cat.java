package com.letsLearn.designPatterns.behavioral.strategyPattern;

public class Cat extends Animal{
	
	public Cat(){
		super();
		setName("Cat");
		setFood("milk");
		setSound("miaaoooo");
		setSpeed(20.00);
		setWeight((float) 10.5);
		flyingType = new CantFly();
		
	}

}
