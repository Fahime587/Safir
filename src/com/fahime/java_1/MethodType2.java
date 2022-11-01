package com.fahime.java_1;

public class MethodType2 {

 int hourlyincome = 50;
	
	public static void main(String[] args) {
		//MethodType2 obj = new MethodType2();
		annualincomevoid();
		monthlyincomereturn();
		weeklyincome();
	}
//void method
	public static void annualincomevoid(){
	
		int calculateannualincomevoid = 50 * 2000;
		System.out.println("My annual income:"+calculateannualincomevoid);
	}
	
	//Return type
	public static void monthlyincomereturn(){
		int calculatemonthlyincomereturn = 50*500;
		System.out.println("My monthly income:"+calculatemonthlyincomereturn);
	}
	//static method
	
	public static void weeklyincome(){
		int calculateweeklyincome = 50 *200;
		System.out.println("My weekly income:"+calculateweeklyincome);
	}
	
	
	
	
	
	
	
	
}
