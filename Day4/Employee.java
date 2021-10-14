package com.java.Day4;

public class Employee {
	public String EmployeeId;
	private float Salary;
	public String Designation;
	
	
	
	float getSalary() {
		return Salary;
	}
	void setSalary(float salary) {
		Salary = salary;
	}
	public void CurrentSalary(String Name) {
		System.out.println("The current salary of " +Name+ " is " +getSalary());
	}
	public static void main(String[] args) {
		

	}

}
