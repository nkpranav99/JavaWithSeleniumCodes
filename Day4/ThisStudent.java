package com.java.Day4;

public class ThisStudent {
	int id;
	String name;
	
	ThisStudent(){
		System.out.println("This is the empty constructor.");
	}
	ThisStudent(int id, String name){
		this.id = id;
		this.name = name;
		System.out.println("This is the parameterised constructor.");
	}
	
	void show() {
		System.out.println(id + " " + name);
	}
	public static void main(String[] args) {
		ThisStudent s = new ThisStudent();
		s.show();
		ThisStudent s1 = new ThisStudent(1, "abc");
		s1.show();
	}

}
