package com.java.Day4;

public class StaticKeyword{
	int id;
    String name;
    static String collegeName="Pune University";
    static String collegeAddress="Pune";
    
    StaticKeyword(int i, String n)
    {
        id = i;
        name = n;
    }
    
    void show()
    {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
    }
    static void showCollegeDetails()
    {
        System.out.println("College: " + collegeName);
        System.out.println("College Address: " + StaticKeyword.collegeAddress);
    }
    public static void main(String[] args) {
//        static String college;  // a local variable cannot be static.
//        We cannot define a static variable inside main() or other methods()
        
//        System.out.println(Student.collegeAddress);
//        showCollegeDetails();
        StaticKeyword.showCollegeDetails();  // both are fine in the same class
        
        
        StaticKeyword s1 = new StaticKeyword(1, "abc");
        s1.show();
        
        StaticKeyword s2 = new StaticKeyword(2, "xyz");
        s2.show();
        
        System.out.println("access s1.name without method " + s1.name);
        
    }
}