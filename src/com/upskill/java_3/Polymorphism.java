package com.upskill.java_3;

import com.fahime.java_1.MethodType;     // its for overridding

public class Polymorphism extends MethodType {

	public static void main(String[] args) {
		car(4, 5, "Blue");
         MethodType obj = new MethodType();
		obj.annualincomevoid();
	
      
	}

	 //Overloading
	public static void car(){
		System.out.println("My car is BMW");
		
	}
	
	public static void car(int door){
		System.out.println("My car is BMW, It has door :" + 4);
	}
	
	public static void car(int door, int seat, String colour){
	
	System.out.println("My car is BMW , it has door : " +4 +  ", It has seat :" +5 +  ", Colour is:" + "Blue");	
	}
	//Overridding
	
	public void annualincomevoid(){
		int bonus = 5000;
		int calculateannualincome = (hourlyincome * 2000 + bonus);
	    
	    System.out.println("MY annual income :" + calculateannualincome);
	
	}
	
	
	
	
}
