package com.upskill.java_3;

public class Array {

	public static void main(String[] args) {
	 int age = 35;
	 int [] ageThanos = new int[] {30, 35, 40, 45, 50, 55, 60};
	 
	 //Array index                [0],[1],[2],[3],[4], [5],[6]
	 
		System.out.println(ageThanos[4]);
		System.out.println(ageThanos.length);
		
	//Array string example
		String [] NameThanos = new String [] {"Fahime", "Ava", "Anis", "Sami"};
		
		System.out.println("student name" + NameThanos[0]);
		System.out.println("Total student"  +NameThanos.length);
		
	//Multi-dimentional Array String
		
		String [][] NameThanos2D = new String [][] {{"a", "b", "c", "d"},
		                                         { "m", "n", "o"}};
		
	 System.out.println("student name" + NameThanos2D[1][0]);
     System.out.println("Total student"  +NameThanos2D.length);
		
		

	}

}
