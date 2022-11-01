package com.fahime.java_1;

public class MethodType {

	public static int hourlyincome = 75;
	
	public static void main(String[] args) {
		
    MethodType obj = new MethodType();
		obj.annualincomevoid();
		obj.monthlyincomeReturn();
		weeklyincomevoid();
			
	}
     //void method
	public void annualincomevoid(){
	
	int calculateannualincome = hourlyincome *2000;
	System.out.println("My Annual income :::" +calculateannualincome);
	}
	//Return type
	public int monthlyincomeReturn(){
	int calculatemonthlyincome = hourlyincome *180;
	System.out.println("My monthly income :::" + calculatemonthlyincome );
	return calculatemonthlyincome;
	}
	
	//static method
	public static void weeklyincomevoid(){
	int calculateweeklyincome = hourlyincome *40;
	System.out.println("My weekly income :::" + calculateweeklyincome);
	}
	
	
	
	
	
	
	
}
