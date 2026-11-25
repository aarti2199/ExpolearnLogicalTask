package com.keywords;

public class DemostrateStaticMethod {

//	Write a Java program to demonstrate a static method.
	
	public static void staticMethod() {
		System.out.println("This is static method");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Method Started..");
		
		//For static method, it is not compulsory to create an object.
		//either you can directly called by method name or by class name.
		
		DemostrateStaticMethod.staticMethod();
		
		staticMethod();
		
		System.out.println("Main Method Ended..");
	}
}
