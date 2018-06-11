package com.letsLearn.designPatterns.creational.factory;

public class Science implements Book{
	
	Science(){
		System.out.println("Picked Science book");
	}
    
	public void read(){
		System.out.println("Reading Science book");
	}
}
