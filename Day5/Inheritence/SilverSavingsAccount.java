package com.java.Day5.Inheritence;
import java.util.Scanner;

class SavingsAccount extends Account{
	float rateOfInterest;
	
	void inputSavingDetails() {
		System.out.println("Enter ROI: ");
		rateOfInterest = sc.nextFloat();
	}
	
	void showSavingDetails() {
		System.out.println("ROI: " +rateOfInterest);
	}
}


class Account{
	String id;
	double balance;
	
	Scanner sc = new Scanner(System.in);
	void input() {
		System.out.println("Enter your id and balance: ");
		id = sc.next();
		balance = sc.nextDouble();
	}
	
	void show() {
		System.out.println("Id: " +id);
		System.out.println("Balance: " +balance);
	}
}

public class SilverSavingsAccount extends SavingsAccount{
	String OfferId;
	
	void inputSilverSavingDetails() {
		System.out.println("Enter ROI for Silver Savings Account: ");
		rateOfInterest = sc.nextFloat();
		System.out.println("Enter Offer Id: ");
		OfferId = sc.next();
	}
	
	void showSilverSavingDetails() {
		System.out.println("ROI for Silver Savings Account: " +(rateOfInterest));
		System.out.println("Offer Id: " +OfferId);
	}
	
	public static void main(String[] args) {
		SilverSavingsAccount s1 = new SilverSavingsAccount();
		s1.input();
		s1.inputSavingDetails();
		s1.show();
		s1.showSavingDetails();
		s1.inputSilverSavingDetails();
		s1.showSilverSavingDetails();
	}
}
