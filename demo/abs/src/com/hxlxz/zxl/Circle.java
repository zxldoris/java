package com.hxlxz.zxl;

public class Circle extends Shape {
	private double radius;
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void primeter() {
		// TODO Auto-generated method stub
		double c;
		c = 2 * Math.PI * radius;
		System.out.println("Circle primeter:" + c);
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		double s;
		s = Math.PI * radius + radius;
		System.out.println("Circle area:" + s);
	}

}
