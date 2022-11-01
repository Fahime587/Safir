package com.fahime.java_1;

public class IfElseStatement {

	
	static int age = 59;
	
	
	public static void main(String[] args) {
		age();
     
	}
   
	// If Else Statement
	public static void age(){
		if (age < 13){
     System.out.println("you are children");
		} 
		else if (age > 13 && age < 18){
			System.out.println("you are Teenager");
		}
		else if (age >= 60){
			
	 //Nested If Else Statement
			if (age > 100){
				System.out.println("you are Hero");
			}else{		
			System.out.println("you are Senior");
			}
		}else{
			System.out.println("you are Adult");
			}	
			
		}	
	}

	
	
	
     
	
	
	
	
	
	
	
	

