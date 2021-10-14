package com.java.basics;

import java.util.*;
public class DrivingLicense {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your age: ");
		int age = sc.nextInt();
		if(age >= 18) {
			System.out.println("You are eligible for a driving license!");
		}
		else {
			System.out.println("Please try once you are 18 years old.");
		}

	}

}
