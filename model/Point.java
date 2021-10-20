package model;

import java.util.Objects;

public class Point {
	// EX2- 1-- private fields x and y
	private int x;
	private int y;

	// EX2- 7-- To keep track of the number of Points that we created we have to declare a variable as static
	private static int nbstatic = 0;



	public Point() {
		// EX2- 7-- Increment the static variable in the constructor.
		nbstatic++;
	}


	// EX2- 5-- There is no problem because the variables x and y have different name from the arguments, no need to use the keyword 
	// 'this' to differentiate between them.

	//	public Point(int px, int py) {
	//		x = px;
	//		y = py;
	//	}



	// EX2- 6-- It is assigning the same value of the variables that are in the parameters because the private fields x and y have
	// the same name of the parameters, so the return value of private x and y is 0, it didn't affect the parameter variables
	// to the private variables. 
	// So here we need to use the keyword 'this' to differentiate between the private value and the parameters to assign the values
	// of the parameters to the private fields.
	public Point(int x, int y) {
		this.x = x;
		this.y = y;

		// EX2- 7-- Increment the static variable in the constructor.
		nbstatic++;
	}



	// EX2- 8--  The compiler knows which constructor to call depending on the arguments that we add when creating an instance
	// of the class Point.
	public Point(Point p2) {
		this.x = p2.x;
		this.y = p2.y;

		// EX2- 7-- Increment the static variable in the constructor.
		nbstatic++;


	}

	// EX2- 7-- Created a method that returns the static variable so I can access it in the main.
	public int getStaticCount() {
		return this.nbstatic;
	}


	// EX2- 1-- It works because the class Point has two private variables, so to access them we need to create an
	// instance of this class. It is the principal of the encapsulation.
	public void printMethod() {
		//Point p = new Point();
		//System.out.println(p.x + " " + p.y);
	}



	// EX2 2/4-- getters and setters for the private variables x and y.
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}



	// EX2- 9-- This method toString will return the point in a specific format (x,y)
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}




	// EX3- 2-- isSameAs method that returns true if the two points have the same coordinates. If not returns false.
	public boolean isSameAs(Point p) {
		if(this.x == p.x && this.y == p.y) {
			System.out.println("they have the same coordinates");
			return true;
		}
		System.out.println("they do not have the same coordinated");
		return false;

	}



	// EX3- 3-- Overriding the equals method to test if the coordinates of Points are equals, return true.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point p =  (Point) obj;
			if(this.x == p.x && this.y == p.y) {
				return true;
			}
		}
		return false;
	}






	// EX5- 1-- Translate method
	public void translate(int dx, int dy) {
		this.x = dx;
		this.y = dy;
	}


}
