package com.fahime.java_1;

public class Loops {

	public static void main(String[] args) {
		//ForLoop();
        // WhileLoop();
	    // DoWhileLoop();
	    // InfiniteLoop();
           NestedForLoop();
	}


 public static void ForLoop(){
	 int i;
	 for (i = 1; i <=100; i++){
	System.out.println(i);	 
	 }
 }
 
 public static void WhileLoop(){
	 int i = 1;
	 while(i<=100){
		System.out.println(i);
		i++;
	 }
 }
 public static void DoWhileLoop(){
	 int i = 1;
	 do {
		System.out.println(i);
		i++;
	 }while(i<=100);
	 }

 public static void InfiniteLoop(){
	 int i;
	 for(i=1; ; i++){
		System.out.println(i); 
	 }
 }
 public static void NestedForLoop(){
	 int i;
	 int j;
	 for(i=1; i<=10; i++){
     for(j=1; j<=10; j++){
     int multipicationTable = i * j;
     System.out.println(multipicationTable + " ");
     }
	 System.out.println(" ");
	 }
 }






}
