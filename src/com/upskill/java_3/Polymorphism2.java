package com.upskill.java_3;

import com.fahime.java_1.Loops;

public class Polymorphism2 extends Loops{

	public static void main(String[] args) {
		Mobile(2,5, "Black");
        ForLoop();
	}
   //Method Overloading
	public static void Mobile(){
		System.out.println("My Mobile is Nokia");
	}
	
	public static void Mobile(int camera){
		System.out.println("My Mobile is Nokia, it has camera:"+2);
	}
	
	public static void Mobile(int camera, int speaker, String colour){
		System.out.println("My Mobile is Nokia, it has camera:"+2 + ",it has speaker:" + 5 + ",colour:"+"Black");	
	}
	//Method Overriding
	
	
	
	
	
	
}
