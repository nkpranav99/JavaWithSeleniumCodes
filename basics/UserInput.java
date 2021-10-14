package com.java.basics;

import java.util.Scanner;



public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = a + b;
		int diff = a - b;
		int mul = a * b;
		int div = a / b;
		int mod = a % b;
		
		System.out.println(sum);
		System.out.println(diff);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod);
	}

}
