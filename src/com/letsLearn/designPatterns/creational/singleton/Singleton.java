package com.letsLearn.designPatterns.creational.singleton;

public class Singleton {
	
	private static Singleton singletonInst = null;
	static Object obj = new Object();
	
	private Singleton(){
		System.out.println("Singleton Object Created");
	}
	
	public static Singleton getSingleton(){
		if(singletonInst == null){
			synchronized (Singleton.class) {
			if(singletonInst == null){
				singletonInst = new Singleton();				
			}			
		  }
		}	
		return singletonInst;			
	}
	
	public Object clone() throws CloneNotSupportedException{
		return null;		
	}

}
