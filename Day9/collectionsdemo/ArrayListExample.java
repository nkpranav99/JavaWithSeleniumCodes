package com.java.Day9.collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//arrays are static and are of fixed size

//arrays are collections of similar type of elements
// eg. array of integers, Strings, Objects, etc.

//Different operations on arrays( but no inbuilt functions )
//Enhanced for loop: works only with arrays and collections

/* 
Collection Framework(dynamic size)
Framework ----->> group of classes
Framework with huge lib: methods to apply for different operations


ArrayList: array with duplicate elements (by default 10 elements)
Set: no duplicate values

Map: key-value pair
--------------------------------------------

Iterator --->> Universal cursor: any of the collection classes
ListIterator > applicable only for List


*/

public class ArrayListExample {

	public static void main(String[] args) {
//		ArrayList al = new ArrayList();
//		
//		al.add("Ram");
//		al.add("Pranav");
//		al.add("Ram");
//		al.add("Deeksha");
//		int i = 9;
//		al.add(i); //autoboxing -->> converts from primitive to class type - Integer
//		
//		System.out.println(al);
		
//		------------------ generics (Used for type safety)	ArrayList<String>
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al2 = new ArrayList<String>();
		al.add("Ram");
		al.add("Pranav");
		al.add("Ram");
		al.add("Deeksha");
		int j = 9;
//		al.add(j); // cannot add to String type ArrayList
		System.out.println(al);
		
		al2.add("A");
		al2.add("A");
		al2.add("A");
		al.addAll(al2);
		System.out.println(al);
		System.out.println("Size: " +al.size()); //count of elements
		
		System.out.println(al.get(0)); // fetches element using index
		
		for(String e: al) {
			if(e.startsWith("R")) {
				System.out.println(e);
				
			}
		}
		//using iterator to iterate
		
		Iterator<String> it = al.iterator(); // Note: Always import from util class
//		** Iterator is a universal cursor; can work with any of the collection classes
		//ListIterator --->> applicable for lists also; can be used to traverse backwards as well
//		Iterator is an interface here
//		iterator is a method of ArrayList
		
		System.out.println("Forward direction");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//-------------------------
//		System.out.println(it.next()); // after one full iteration; will give error as there are no more elements in the Arraylist
		System.out.println(it.hasNext()); // false as we are on the last element
//		----------------------Using ListIterator-------------------

		
		ListIterator<String> ltr = al.listIterator();
		System.out.println("Forward direction: ");
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		System.out.println("Backward Direction: "); // please ensure that you traverse through forward direction once
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
		
		//-----------------------------------------------------------------
		ListIterator<String> ltr1 = al.listIterator();
        System.out.println("Forward direction");
        while(ltr1.hasNext())
        {
            System.out.println(ltr.next());
            ltr1.set(ltr1.next().concat(" Hello"));
        }
        
        System.out.println("Backward direction"); // pls ensure that you use forward direction once
        while(ltr1.hasPrevious())
        {
            System.out.println(ltr1.previous());
        }

	}

}
