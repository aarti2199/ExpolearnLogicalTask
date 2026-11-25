package com.keywords;

public class FindNoOfObjCreationsUsingStaticVariable {

	static int count;

	public FindNoOfObjCreationsUsingStaticVariable() {

		count++;
	}

	public static void main(String[] args) {

		FindNoOfObjCreationsUsingStaticVariable obj1 = new FindNoOfObjCreationsUsingStaticVariable();

		FindNoOfObjCreationsUsingStaticVariable obj2 = new FindNoOfObjCreationsUsingStaticVariable();

		FindNoOfObjCreationsUsingStaticVariable obj3 = new FindNoOfObjCreationsUsingStaticVariable();

		FindNoOfObjCreationsUsingStaticVariable obj4 = new FindNoOfObjCreationsUsingStaticVariable();

		System.out.println("Count of Object Created in this project are : " + count);
	}

}
