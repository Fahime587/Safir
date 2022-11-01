package com.upskill.java_4;

public class Singleton {

	
	private Singleton(){
		
	}
	
	
	private static Singleton Singletonobj = new Singleton();
	
	public static Singleton getInstance(){
		return Singletonobj;
	}
	protected static void demo(){
		System.out.println("Singleton practise");
	}
	
	
}
