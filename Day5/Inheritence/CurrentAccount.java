package com.java.Day5.Inheritence;

public class CurrentAccount extends SilverSavingsAccount{
	double transactionFee;
	
	void inputCurrentDetails() {
		System.out.println("Enter Transaction Fee: " );
		transactionFee = sc.nextDouble();
	}
	
	void showCurrentDetails() {
		System.out.println("Transaction Fee: " +transactionFee);
	}
	public static void main(String[] args) {
		SilverSavingsAccount obj1 = new SilverSavingsAccount();
		CurrentAccount obj2 = new CurrentAccount();
		
		System.out.println("Enter Saving Account details: ");
		obj1.input();
		obj1.inputSavingDetails();
		
		System.out.println("Enter current account details: ");
		obj2.input();
		obj2.inputCurrentDetails();
		
		System.out.println("Details of Savings account: ");
		obj1.show();
		obj1.showSavingDetails();
		
		System.out.println("Details of Current account: ");
		obj2.show();
		obj2.showSavingDetails();

	}

}
