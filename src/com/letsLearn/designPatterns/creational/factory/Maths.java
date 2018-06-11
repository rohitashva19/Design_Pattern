package com.letsLearn.designPatterns.creational.factory;

public class Maths implements Book{
	
	Maths(){
		System.out.println("Picked Maths book");
	}

    public void read(){
		System.out.println("Reading Maths book");
	}
}
