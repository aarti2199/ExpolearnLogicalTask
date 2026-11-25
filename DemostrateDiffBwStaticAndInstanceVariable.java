package com.keywords;

public class DemostrateDiffBwStaticAndInstanceVariable {

	static int number;
	
	String name;
	
	public DemostrateDiffBwStaticAndInstanceVariable() {
		
		number = 101;
		name = "Arti";
		
	}
	
	public void m1() {
		
		System.out.println("Static variable in non-static method : " + number);
		System.out.println("non-static variable in non-static method : " + name);
	}
	
	static void m2() {
		System.out.println("static variable in static method/block : " + number);
		
		DemostrateDiffBwStaticAndInstanceVariable d = new DemostrateDiffBwStaticAndInstanceVariable();
		
		System.out.println("non-static variable in static block/method (by creating object): " + d.name);
	}
	
	public static void main(String[] args) {
	
		DemostrateDiffBwStaticAndInstanceVariable d = new DemostrateDiffBwStaticAndInstanceVariable();
		
		d.m1();
		m2();
	}
}
