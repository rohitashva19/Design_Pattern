package com.letsLearn.designPatterns.creational.singleton;



public class MyClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Singleton aInst = Singleton.getSingleton();
		Singleton bInst = (Singleton) aInst.clone();//ClassLoader(Singleton.class);
		Singleton cInst = Singleton.getSingleton();
		
		System.out.println("aInst : " + aInst + " ; bInst : " + bInst + "\n"
				+ " ; cInst : " + cInst);
		
		if(aInst == cInst){
			System.out.print("Equal");			
		}
		
	}

}
