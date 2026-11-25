package com.keywords;

public class DemostrateFinalMethod {

	public final void m1() {
		System.out.println("Final Method called.");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Method Called.");
		
		DemostrateFinalMethod d = new DemostrateFinalMethod();
		
		d.m1();
	}
	
}
