package com.java.Assignment1;

public class Pattern3 {

	public static void main(String[] args) {
		int i,j;
		int num = 10;
		for(i = 0; i < 5; i++) {
			for(j=0; j<i; j++) {
				System.out.print(num+ " ");
				num-=1;
			}
			System.out.println("\n");
		}

	}

}
