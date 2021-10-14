package com.java.Day8.Encapsulation;

public class Student {
	private int Id;
	private String Name;
		
	int getId() {
		return Id;
	}

	void setId(int id) {
		Id = id;
	}

	String getName() {
		return Name;
	}
	void setName(String name) {
		Name = name;
	}



	public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.Id);
        System.out.println(s.Name);
        
        s.setId(1);
        s.setName("Sunil");
        
        System.out.println("Id: " + s.getId());
        System.out.println("Name: " + s.getName());
        
//        Reflection in Java to get class name
        System.out.println("Name: " + s.getClass());
    }
}
