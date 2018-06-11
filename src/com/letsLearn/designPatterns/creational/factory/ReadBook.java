package com.letsLearn.designPatterns.creational.factory;

public class ReadBook {
	
	public Book getBook(String bookName){
		if(bookName == null){
			return null;
		} else if(bookName.equalsIgnoreCase("Maths")){
			return new Maths();			
		} else if(bookName.equalsIgnoreCase("Science")){
			return new Science();
		}
		
		return null;
	}
}
