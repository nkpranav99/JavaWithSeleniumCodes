package com.java.arrays;

public class ArrayExample {

	public static void main(String[] args) {
		int array[] = new int[5]; // by default values are initialized to zero
//		for(int i=0; i<array.length; i++)
//			System.out.println(array[i]);
		System.out.println(array); // outputs the reference to array
		
		int arr[] = {11,15,10,13,20,13,12,10};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
