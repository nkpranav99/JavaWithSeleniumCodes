package com.java.Day5.Inheritence;

public class Sample { //Factory methods

	Shape create(char ch) {
		if(ch == 'C') {
			return new Circle();
		}
		else if(ch == 'R') {
			return new Rectangle();
		}
		else if(ch == 'T') {
			return new Triangle();
		}
		else {
			return new Shape();
		}
	}
	public static void main(String[] args) {
		Sample obj = new Sample();
        Shape s = obj.create('R');
        s.draw();  // Drawing ----- // depends on the character send to create method

	}

}
