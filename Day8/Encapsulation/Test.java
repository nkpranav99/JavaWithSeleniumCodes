package com.java.Day8.Encapsulation;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
//        System.out.println(s.id); // not allowed to access from other class
        s.setId(1);
        s.setName("Sunil");
        
        System.out.println("Id: " + s.getId());
        System.out.println("Name: " + s.getName());
        
    }
}