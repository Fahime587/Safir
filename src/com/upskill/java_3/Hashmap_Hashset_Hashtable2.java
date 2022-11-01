package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Hashmap_Hashset_Hashtable2 {

	public static void main(String[] args) {
		
//Hashmap
		HashMap<String,Integer>car = new HashMap<String, Integer>();
		car.put("BMW", 10);
		car.put("Audi", 20);
		car.put("GMC", 30);
		car.put("Honda", 40);
	System.out.println(car.get("GMC"));
	//Hashset
	HashSet<String>student = new HashSet<String>();
	student.add("A");
	student.add("B");
	student.add("C");
	System.out.println(student);
	//Hashtable
	Hashtable<Integer,Integer>number= new Hashtable<Integer,Integer>();
	number.put(1, 100);
	number.put(2, 200);
	number.put(3, 300);
	System.out.println(number.get(3));
	
	
	
	
	
	
	
	}

}
