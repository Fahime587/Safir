package com.upskill.java_4;

public class ImplementInterface implements Interface {

	public static void main(String[] args) {
		ImplementInterface obj = new ImplementInterface();
		obj.iapple();
		obj.ibanana();
		obj.iorange();
		obj.igrape();

	}

	@Override
	public void iapple() {
		int apple = 4;
		System.out.println("Apple =" + apple);
		
	}

	@Override
	public void ibanana() {
		int banana = 5;
		System.out.println("Banana="+banana);
		
	}

	@Override
	public void igrape() {
		int grape = 100;
		System.out.println("Grape="+ grape);
		
	}

	@Override
	public void iorange() {
	    int orange = 12;
	    System.out.println("Orange="+ orange);
		
	}

}
