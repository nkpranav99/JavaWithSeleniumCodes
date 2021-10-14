package com.java.Day9.collectionsdemo;
import java.util.*;
/*
 * Map > collection of elements > key : value pair(One entry)
 * duplicate values are allowed
 * duplicate keys are not allowed, value would be overwritten
 * 
 * Map is an interface
 * Implemented by CLasses
 * HashMap > insertion order is random; key can be null
 * LinkedHashMap > insertion order is maintained; key can be null
 * TreeMap > insertion order is sorted; key cannot be null
 * 
 * 
 * */


public class MapExample {

	public static void main(String[] args) {
//		HashMap<Integer, String> hm = new HashMap<Integer, String>();
//		hm.put(3,  "C"); // one entry - key value pair
//		hm.put(2, "A");
//		hm.put(3, "E"); // duplicatekey hence value will be overwritten
//		hm.put(null, "T");
//		hm.put(1, "C");
//		hm.put(7, "C");
//		System.out.println(hm);
		
//		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
//		hm.put(3,  "C"); // one entry - key value pair
//		hm.put(2, "A");
//		hm.put(3, "E"); // duplicatekey hence value will be overwritten
//		hm.put(null, "T");
//		hm.put(1, "C");
//		hm.put(7, "C");
//		System.out.println(hm);
		

		TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
		hm.put(3,  "C"); // one entry - key value pair
		hm.put(2, "A");
		hm.put(3, "E"); // duplicatekey hence value will be overwritten
//		hm.put(null, "T"); // null key not allowed
		hm.put(1, "C");
		hm.put(7, "C");
		System.out.println(hm);
		
	}

}
