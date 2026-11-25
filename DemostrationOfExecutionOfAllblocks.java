package com.keywords;

public class DemostrationOfExecutionOfAllblocks {

	static int hours;
	
	public DemostrationOfExecutionOfAllblocks(){
		hours = 24;
		System.out.println("Constructor called.");
	}
	
	{
		System.out.println("Non-static/instance block called");
	}
	
	static {
		System.out.println("Static block called.");
	}
	
	void getAge() {
		System.out.println("Normal method/ non-static method called.");
		System.out.println(hours);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main method started.");
		
		DemostrationOfExecutionOfAllblocks d = new DemostrationOfExecutionOfAllblocks();
		
		System.out.println("Main method ended.");
	}
}
