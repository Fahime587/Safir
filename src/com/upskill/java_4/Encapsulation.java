package com.upskill.java_4;

public class Encapsulation {

  private String name = "Fahime";
  private int age    = 32;
  private int grade  = 5;
  
  public void Setname(String value){
	  name = value;
	  //System.out.println("Fahime");  (run on main method)
	
  }
	public String Getname(){
		return name;
		
	}
	
	public int Getage(){
		return age;
		
	}
	public void Setgrade(int value){
		grade = value;
	}
	public int Getgrade(){
		return grade;
	}
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.Setname("Sami");
		obj.Setgrade(5);
		System.out.println(obj.Getname());
		System.out.println(obj.Getage());
		System.out.println(obj.Getgrade());
	}

}
