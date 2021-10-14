package com.java.Day8.Strings;

public class Immutable {

	public static void main(String[] args) {
		String s = "Sunil";
		s.concat("Bansal");
		System.out.println(s); // output is only Sunil since strings in Java are immutable
		s = s.concat("Bansal"); // workaround for the above case; new object gets created for this; hence immutability is proved
		System.out.println(s);
	}

}
