package com.java.Day3;

import java.util.Scanner;

public class CalculatorDoWhile {

	public static void main(String[] args) {
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: \n A. Addition S. Subtraction M. Multiplication D. Division R. Modulus Q. Quit");
		char choice = sc.nextLine().charAt(0);
		if(choice == 'Q') {
			System.out.println("Program Quit Successfully!");
			break;
		}
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		
		if(choice == 'A') {
			System.out.println("Sum = " +(a+b) );
		}
		else if(choice == 'S') {
			System.out.println("Difference = " +(a-b) );
		}
		else if(choice == 'M') {
			System.out.println("Product = " +(a*b) );
		}
		else if(choice == 'D') {
			System.out.println("Quotient = " +(a/b) );
		}
		else if(choice == 'R') {
			System.out.println("Modulus = " +(a%b) );
		}
		else {
			System.out.println("Please enter a valid input!");
		}
	}while(true);
	}
}

