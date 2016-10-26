package com.hxlxz.zxl;

public class Rectangle extends Shape {

	private float line1;
	private float line2;
	private float line3;
	public float getLine1() {
		return line1;
	}

	public void setLine1(float line1) {
		this.line1 = line1;
	}

	public float getLine2() {
		return line2;
	}

	public void setLine2(float line2) {
		this.line2 = line2;
	}

	public float getLine3() {
		return line3;
	}

	public void setLine3(float line3) {
		this.line3 = line3;
	}

	@Override
	public void primeter() {
		// TODO Auto-generated method stub
		float c;
		c = line1+line2+line3;
		System.out.println("Rectangle primeter:"+c);
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		float s;
		s = (line1 + line2 + line3)/2;
		System.out.println("Retangle area:" + s);
	}

}
