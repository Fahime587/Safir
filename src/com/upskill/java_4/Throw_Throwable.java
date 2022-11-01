package com.upskill.java_4;

public class Throw_Throwable {

	public static void main(String[] args)throws ArithmeticException {
		 //Throwable
 try{
 int a = 9/0;    
}catch(Throwable e){      //exception or error both can catch by throwable and its called super class
 e.printStackTrace();
 System.out.println("PQR");
 }
	//.........................................//for throwable	
		
		Throw_Throwable obj = new Throw_Throwable();
     obj.sum();
	System.out.println("ABC");
	}
    
	
	//Throw
	public static void sum()throws ArithmeticException{
		try{                                              //Exception fixed here by try catch
		div();
		}catch(ArithmeticException e){
			
		}
	}
	
	public static void div() throws ArithmeticException{
		int a = 9/0;   // exception line
		
	}
	 
	
	
}
