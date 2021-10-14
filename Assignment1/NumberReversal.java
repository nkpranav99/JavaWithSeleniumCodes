package com.java.Assignment1;
import java.util.*;
public class NumberReversal {

	public static void main(String[] args) {
		int reversed = 0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num != 0) {
		      int digit = num % 10;
		      reversed = reversed * 10 + digit;
		      num /= 10;
		    }
		System.out.println("Reversed Number: " + reversed);

	}

}
