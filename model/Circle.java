package model;

public class Circle implements Shapes {
	private Point center;
	private double radius;

	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	// EX2- 1-- method that implements from the shape interface.
	@Override
	public String toString() {
		return "center: " + this.center + ", radius: " + this.radius + ", area: " + area();
	}

	
	public void translate(int dx, int dy) {
		this.center.translate(dx, dy);

	}

	public Point getCenter() {
		Point storePoint = new Point(this.center);
		return storePoint;
	}

	// EX2- 1-- method that implements from the shape interface.
	@Override
	public double area() {
		return Math.PI * Math.pow(this.radius, 2);
	}


	// EX2- 1-- method that implements from the shape interface.
	@Override
	public boolean contains(Point p) {
		double pointOnCircle = 0;

		pointOnCircle = Math.pow(this.radius, 2);
		System.out.println(pointOnCircle);
		System.out.println(p.getX());
		System.out.println(p.getY());
		if(Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2) < pointOnCircle) {
			System.out.println("inside the circle");
			return true;
		}
		System.out.println("outside the circle");
		return false;
	}


	public boolean contains(Point p, Circle[] circles) {
		double pointOnCircle = 0;

		pointOnCircle = Math.pow(this.radius, 2);
		for(int i=0; i<circles.length; i++) {
			if(Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2) < pointOnCircle) {
				System.out.println("inside the circle: " + circles[i]);
			}
			System.out.println("outside the circle: " + circles[i]);
		}
	
		return false;
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		
	}
	

}

