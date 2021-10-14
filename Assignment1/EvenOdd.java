package com.java.Assignment1;

import java.util.*;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num+ " is an even number.");
		}
		else {
			System.out.println(num+ " is a odd number.");
		}

	}

}
