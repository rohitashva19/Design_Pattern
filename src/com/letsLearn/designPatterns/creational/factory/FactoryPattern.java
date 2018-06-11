package com.letsLearn.designPatterns.creational.factory;

public class FactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReadBook readBook = new ReadBook();
		
		Book maths = readBook.getBook("maths");
		maths.read();
		
		Book science = readBook.getBook("science");
		science.read();
	}

}
