package model;

public class Ring extends Circle {

	// EX6- 1-- We should use inheritance because the ring has the same properties and attributes of the circle but of course,
	// with it's own attributes and methods that are specific to the ring.


	private int innerRadius;



	// EX6- 2-- Constructor with the innerRadius < radius
	public Ring(Point center, int radius, int innerRadius) {
		super(center, radius);

		this.innerRadius = innerRadius;

		if(this.innerRadius <= radius) {
			System.out.println("inner radius < radius");
		}

		else {
			System.out.println("inner radius > radius");
			this.innerRadius = 0;
		}

	}


	// EX6- 3-- equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		Ring ring = (Ring) obj;
		if (this.innerRadius != ring.innerRadius) {
			return false;
		}

		super.equals(obj);
		return true;
	}


	// EX6- 4-- toString method override- details in the TestRing class
	@Override
	public String toString() {
		return super.toString() + ", inner radius: " + this.innerRadius;
	}


	// EX6- 5-- contains method override
	public boolean contains(Point p) {
		return super.contains(p);
	}



	// EX6 6-- contains method with 2 params
	public boolean contains(Point p, Ring[] rings) {
		return super.contains(p, rings);
	}

}
