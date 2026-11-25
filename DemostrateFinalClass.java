package com.keywords;

public final class DemostrateFinalClass {

//	Write a Java program to demonstrate a final class.
	
	final int age = 25;
	final String name = "Sakhu";
	
	public final void m1() {
		System.out.println("Final Method called.");
		
		System.out.println("Details : " + "Age : " + age + " name : " + name);
	}
	
final public static void main(String[] args) {
		
	DemostrateFinalClass d = new DemostrateFinalClass();
	
	d.m1();
	
	}
	
}
