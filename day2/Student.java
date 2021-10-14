package com.java.day2;

public class Student {
	private int rollNo;
	private String FirstName;
	public String address;
	String city; //Default variable; can be accessed within the package itself
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	String getCity() {
		return city;
	}
	void setCity(String city) {
		this.city = city;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}
