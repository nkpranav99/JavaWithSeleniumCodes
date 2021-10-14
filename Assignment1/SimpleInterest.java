package com.java.Assignment1;

import java.util.*;


public class SimpleInterest {

	public static float SimpleInterestCalc(int principle, float ROI, int time){
		return (principle*ROI*time)/100;
	}

	public static void main(String[] args) {
		int principle, time;
		float ROI;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principle Amount: ");
		principle = sc.nextInt();
		System.out.println("Enter the Rate of Interest: ");
		ROI = sc.nextFloat();
		System.out.println("Enter the Time in Years: ");
		time = sc.nextInt();
		
		float SimpleInterest = SimpleInterestCalc(principle,ROI,time);
		
		System.out.println("The Simple Interest on the principle amount is: " +SimpleInterest);
	}

}
