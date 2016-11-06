package com.hxlxz.zxl;

public class PickUp extends Car {

	private String name;
	private int rentPrice;
	private int perCarry;
	private float goodsCarry;
	
	public PickUp(String name, int rentPrice, int perCarry, int goodsCarry) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.rentPrice = rentPrice;
		this.perCarry = perCarry;
		this.goodsCarry = goodsCarry;
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

	public int getPerCarry() {
		return perCarry;
	}

	public void setPerCarry(int perCarry) {
		this.perCarry = perCarry;
	}

	public float getGoodsCarry() {
		return goodsCarry;
	}

	public void setGoodsCarry(float goodsCarry) {
		this.goodsCarry = goodsCarry;
	}

}
