package com.keywords;

public class DemostrateStaticInintializationBlock {

//	Write a Java program to demonstrate a static initialization block.
	
	static {
		System.out.println("Static Block Called.");
	}
	
	public static void main(String[] args) {
	
		System.out.println("Main Method Called.");
	}
}
