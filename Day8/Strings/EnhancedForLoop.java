package com.java.Day8.Strings;

import java.util.*;

public class EnhancedForLoop {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 5 numbers: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		// using enhance for loop
		// enhanced for loop cannot be used for getting inputs
		System.out.println("Elements of the array: ");
		for(int a: arr) {
			System.out.println(a);
		}
		
		String players[] = {"Sachin", "Virat", "Rahul", "Dhoni"};
		for(String player:players) {
			System.out.println(player);
		}
		
		sc.close();
	}

}
