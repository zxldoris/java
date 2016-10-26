package com.hxlxz.zxl;

public class Initail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle();
		rectangle.setLine1(12);
		rectangle.setLine2(12);
		rectangle.setLine3(12);
		rectangle.primeter();
		rectangle.area();
		Circle circle = new Circle();
		circle.setRadius(1.2);
		circle.primeter();
		circle.area();
	}

}
