package com.java.basics;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: \n A. Addition S. Subtraction M. Multiplication D. Division R. Modulus Q. Quit");
		char choice = sc.nextLine().charAt(0);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		sc.close();
		switch(choice) {
			case 'A': 
				System.out.println("Sum = " +(a+b) );
				break;
			case 'S': 
				System.out.println("Difference = " +(a-b) );
				break;
			case 'M': 
				System.out.println("Product = " +(a*b) );
				break;
			case 'D': 
				System.out.println("Quotient = " +(a/b) );
				break;
			case 'R':
				System.out.println("Remainder = " +(a%b));
				break;
			case 'Q': 
				System.out.println("Functionality yet to be developed!");
				break;
			default:
				System.out.println("Enter valid inputs!");
		}
	}

}
