package com.upskill.java_4;

public class ChildOfAbstractClass extends AbstractClass {

	public static void main(String[] args) {
		ChildOfAbstractClass obj = new ChildOfAbstractClass();
         obj.ianis();
         obj.isami();
         obj.iava();
         obj.irupa();
         obj.ifahime();
	}

	@Override
	public void ianis() {
		int age = 40;
	System.out.println("Anis vai age = " + age);	
	}

	@Override
	public void isami() {
		int age = 30;
		System.out.println("Sami vai age = " + age);
		
	}

	@Override
	public void iava() {
		int age = 23;
		System.out.println("Ava apu age = " + age);
		
	}

	@Override
	public void irupa() {
		int age = 35;
		System.out.println("Rupa apu age = " + age);
		
	}

	@Override
	public void ifahime() {
		int age = 33;
		System.out.println("Fahime vai age = " + age);
		
	}

}
