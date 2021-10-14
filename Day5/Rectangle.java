package com.java.Day5;

public class Rectangle {
	float length, breadth;
	int x,y;
	
	Rectangle(){
//		x = y = 0;
//		length = breadth = 0;
		this(0,0,0,0); //code reuse
	}
	
	Rectangle(float length, float breadth){
//		x = y = 0;
//		this.length = length;
//		this.breadth = breadth;
		
		this(0,0,length,breadth); // code reuse
	}
	
	Rectangle(int x, int y, float length, float breadth){
		this.x = x;
		this.y = y;
		this.length = length;
		this.breadth = breadth;
	}
	
	void show() {
		System.out.printf("%d %d %f %f\n", x, y, length, breadth);
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(6,10);
		
		r1.show();
		r2.show();

	}

}
