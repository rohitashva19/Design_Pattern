package com.letsLearn.designPatterns.behavioral.strategyPattern;

public class AnimalPlays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal Sparky = new Cat();
		Animal Ducky = new Duck();
		
		System.out.println("Cat : " + Sparky.getSound() + " : " + Sparky.tryingToFly());

		System.out.println("Duck : " + Ducky.getSound() + " : " + Ducky.tryingToFly());
	}

}
