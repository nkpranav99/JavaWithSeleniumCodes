package com.java.arrays;

public class Day2Task {
	static int count = 0;
	static int key = 10;
	public static void main(String[] args) {
		int arr[] = {11,15,10,13,20,13,12,10};
		//#1
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				count += 1;
			}
		}
		System.out.println("-----------------------#1--------------------------");
		System.out.println("The number 10 appears " +count+ " times in the array.");
		
		//#2
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				System.out.println("-----------------------#2--------------------------");
				System.out.println("The number 10 is found in the array.");
				System.out.println("-----------------------#3--------------------------");
				break;
			}
			else {
				System.out.println("-----------------------#2--------------------------");
				System.out.println("The number 10 is not in the array.");
				System.out.println("-----------------------#3--------------------------");
			}
		}
		
		//#3
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != key) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("---------------------#4----------------------------");
		//#4
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		System.out.println("--------------------#5-----------------------------");
		//#5
		int max = arr[0],min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Maximum value in the array is: " +max);
		System.out.println("Minimum value in the array is: " +min);
	}

}
