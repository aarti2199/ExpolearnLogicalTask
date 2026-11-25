package com.keywords;

public class AllBlocks {

//	Complete Java programs demonstrating static
//	and final keywords, initialization blocks, and execution order

	static int age;
	final String name;
	public static final String address = "Ravet";

	public AllBlocks() {

		System.out.println("Constructor called.");
		age = 25;
		name = "Arti";
	}

	{
		System.out.println("Instance Block Called.");
	}

	static {
		System.out.println("Static block called.");
	}

	public static final void m1() {
		System.out.println("static and final method called");
		System.out.println("Address : " + address);
	}
	
	public void getDetails() {
		System.out.println("Details : " + "Age : " + age + ", name : " + name);
	}

	public static void main(String[] args) {

		System.out.println("Main method called.");

		AllBlocks all = new AllBlocks();
		
		all.getDetails();
		
		m1();
	}

}
