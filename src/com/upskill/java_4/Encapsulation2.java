package com.upskill.java_4;

public class Encapsulation2 {
	private String name = "Anis";
	private int age = 40;
	private String status = "Married";
	
	
	public static void main(String[] args) {
		Encapsulation2 obj = new Encapsulation2();
        obj.setname("Anis");
        obj.setstatus("Unmarried");
        System.out.println(obj.getname());
        System.out.println(obj.getage());
        System.out.println(obj.getstatus());
	}

	public void setname(String Value){
		name = Value;
	}
	
	public String getname(){
		return name;
	}
	
	public int getage(){
		return age;
	}
	
	public void setstatus(String Value){
		status = Value;
	}
	
	public String getstatus(){
		return status;
	}
	
	
	
	
}
