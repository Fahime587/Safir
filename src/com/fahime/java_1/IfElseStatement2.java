package com.fahime.java_1;

public class IfElseStatement2 {
public static int age = 105;
	
	public static void main(String[] args) {
	age();

	}

	public static void age(){
		if (age<13){
			System.out.println("You are a childrean");
		}
		else if (age>13 && age<18){
		System.out.println("You are a Teenagers");
		}else if (age>=60){
			
			if(age>100){
				System.out.println("You are a Hero");
			}else{
				System.out.println("You are a senior");
			}
		}else{
			System.out.println("You are a adult");
		}
	}
}
			
			
		
		
		
	
	
	
	

