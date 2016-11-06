package com.hxlxz.zxl;

public class Truck extends Car {
	private String name;
	private int rentPrice;
	private float goodsCarry;
	public Truck(String name, int rentPrice, float goodsCarry) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.rentPrice = rentPrice;
		this.goodsCarry =goodsCarry;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRentPrice() {
		return rentPrice;
	}
	public void setRentPrice(int rentPrice) {
		this.rentPrice = rentPrice;
	}
	public float getGoodsCarry() {
		return goodsCarry;
	}
	public void setGoodsCarry(float goodsCarry) {
		this.goodsCarry = goodsCarry;
	}

}
