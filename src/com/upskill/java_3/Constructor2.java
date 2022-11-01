package com.upskill.java_3;

public class Constructor2 {

	String name;
	int age;
	public Constructor2(int i){
		System.out.println(i);
	}
	
	public Constructor2(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	
	public static void main(String[] args) {
		Constructor2 obj = new Constructor2(10);
         Constructor2 obj2=new Constructor2("Anis", 40); 
         System.out.println(obj2.name);
         System.out.println(obj2.age);
	}

}
