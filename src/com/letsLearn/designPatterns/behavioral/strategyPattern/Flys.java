package com.letsLearn.designPatterns.behavioral.strategyPattern;

public interface Flys {

	String fly();
}


class ItFlys implements Flys{
	
	public String fly(){
		return "Flying very high";
	}
}

class CantFly implements Flys{
	
	public String fly(){
		return "Can't fly :(";
	}
}