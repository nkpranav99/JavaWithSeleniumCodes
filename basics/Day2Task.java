package com.java.basics;

import java.util.Scanner;
public class Day2Task {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your age: ");
		int age = sc.nextInt();
		
		if(age < 18) {
			System.out.println("You are a kid.");
		}
		else if(age >=18 && age <= 60) {
			System.out.println("You are a working person.");
		}
		else if(age > 60 && age<=90) {
			System.out.println("You are retired.");
		}
		else {
			System.out.println("Amazing!");
		}

	}

}
