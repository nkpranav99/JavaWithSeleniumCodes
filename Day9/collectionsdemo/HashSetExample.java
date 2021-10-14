package com.java.Day9.collectionsdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/* Set---> interface--> has only unique elements
 * even if duplicate elements are added, it will ignore it; no errors
 *  
 *  Implemented by classes since it is a interface
 *  
 *  HashSet > insertion order is not maintained
 *  LinkedHashSet > maintains insertion order
 *  TreeSet > maintains sorted order
 *  */

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("abc");
		hs.add("xyz");
		hs.add("ttt");
		hs.add("atb");
		hs.add("qwe");
		hs.add("rty");
		hs.add(null);
		hs.add("null");
		System.out.println(hs);

		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		System.out.println("Linked HashSet output: ");
		lhs.add("abc");
		lhs.add("xyz");
		lhs.add("ttt");
		lhs.add("atb");
		lhs.add("qwe");
		lhs.add("rty");
		lhs.add(null);
		lhs.add("null");
		System.out.println(lhs);
		
		System.out.println("TreeSet output");
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("abc");
		ts.add("xyz");
		ts.add("ttt");
		ts.add("atb");
		ts.add("qwe");
		ts.add("rty");
//		ts.add(null); // exception
		ts.add("null");
		System.out.println(ts);
		
	}

}
