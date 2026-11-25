package com.keywords;

public class DemostrateInstanceInitializationBlock {

//	Write a Java program to demonstrate an instance initialization block.
	
	static int age;
	
	public DemostrateInstanceInitializationBlock(){
		age = 25;
		System.out.println("Constructor called.");
	}
	
	{
		System.out.println("Non-static / Instance Block Called.");
	}
	
	public static void main(String[] args) {
		
		System.out.println("value of age before creating object : " + age);
		
		DemostrateInstanceInitializationBlock d = new DemostrateInstanceInitializationBlock();
		
		System.out.println("value of age after object created : " + age);
	
	}
}
