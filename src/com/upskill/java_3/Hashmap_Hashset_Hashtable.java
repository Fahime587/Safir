package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Hashmap_Hashset_Hashtable {

	public static void main(String[] args) {
	//HashMap
		HashMap<String, Integer> student = new HashMap<String, Integer>();
		
		student.put("Fahime", 30);
		student.put("Ava", 23);
		student.put("Anis", 41);
		System.out.println(student.get("Anis"));
		
		//Hashset
		HashSet<Integer> Rent = new HashSet<Integer>();
		
		Rent.add(500);
		Rent.add(1000);
		Rent.add(1200);
		System.out.println("My rent is ::" + Rent);

		//HashTable
		Hashtable<String, Integer> sports = new Hashtable<String, Integer>();
		
		sports.put("Cricket", 1);
		sports.put("Football", 2);
		sports.put("Rugby", 3);
		System.out.println("Game::" + sports.get("Rugby"));
		
	}

}
