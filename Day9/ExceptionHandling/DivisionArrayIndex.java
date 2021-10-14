package com.java.Day9.ExceptionHandling;

public class DivisionArrayIndex {

	public static void main(String[] args) {
		int no1 = 5, no2 = 0;
		int res, index = 4;
		int arr[] = {10,30,20,70,20};
		
		try {
			res = no1/no2;
			System.out.println("Division is " +res);
			System.out.println("Element at index" + arr[index]);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("Cannot divide by zero.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("Array index should be between 0 and 4");
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("General catch block.");
		}
		finally {
			System.out.println("This will always get executed.");
			
		}

	}

}
