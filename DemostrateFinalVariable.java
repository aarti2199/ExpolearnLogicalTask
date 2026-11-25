package com.keywords;

import java.util.Scanner;

public class DemostrateFinalVariable {

	final int num = 10;

	final String name;

	public DemostrateFinalVariable() {
		name = "Arti";
	}

	public static void getInfo(final int numbr, final String st) {

		System.out.println("Number : " + numbr + " & " + "String : " + st);
	}

	public static void main(String[] args) {

		DemostrateFinalVariable d = new DemostrateFinalVariable();

		System.out.println("Final variable declared are : " + d.num + " & " + d.name);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number : ");

		int number = scanner.nextInt();

		System.out.println("Enter String : ");

		String str = scanner.next();

		getInfo(number, str);

	}
}
