package com.letsLearn.designPatterns.behavioral.strategyPattern;

public class Animal {

	
	private String sound;
	private String name;
	private String food;
	private double speed;
	private float weight;
	
	public Flys flyingType;
	
	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public String tryingToFly(){
		return flyingType.fly();
	}
	
	public void setFlyingAbility(Flys newFlyingType){
		flyingType = newFlyingType;
		
	}
}
