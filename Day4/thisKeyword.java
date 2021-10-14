package com.java.Day4;

public class thisKeyword {
	int i = 30;
	
	void show() {
		int i = 90;
		System.out.println("This is the local variable: " +i);
		System.out.println("This is the instance variable: " +this.i);
	}
	public static void main(String[] args) {
		thisKeyword obj = new thisKeyword();
		obj.show();
	}

}
