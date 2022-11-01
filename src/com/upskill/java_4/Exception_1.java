package com.upskill.java_4;

public class Exception_1 {

	public static void main(String[] args) {
		// Buit in exception
		try{
		int a = 9/0;      //Uncaught Exception
		}
         catch(Exception e){
        	 e.printStackTrace();
        	 System.out.println("Exception not specific would be any kind");
         }
		
		
		// Buit in exception (specific Exception)
		
		try{
		int [] ageThanos = new int [] {25, 30, 35, 40};
		System.out.println(ageThanos [5]);
		}
		catch(ArrayIndexOutOfBoundsException e){
		  e.printStackTrace();
		  System.out.println("Specific Exception: ArrayIndexOutOfBoundsException");
		}
		
		//User defined Exception
		
		
		System.out.println("ABC");
		
		try {
			throw new Exception("my Exception");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("PQR");
	}

}
