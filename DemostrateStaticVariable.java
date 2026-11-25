package com.keywords;

public class DemostrateStaticVariable {

//	Write a Java program to demonstrate a static variable.
	
	static int number = 10;
	
	public void m1() {
		
		number = 20;
		
		System.out.println("Static variable in non-static method : " + number);
	
	}
	
	static void m2() {
		System.out.println("static variable in static method/block : " + number);
		
	}
	
	public static void main(String[] args) {
	
		DemostrateStaticVariable d = new DemostrateStaticVariable();
		
		d.m1();
		m2();
	}
}
