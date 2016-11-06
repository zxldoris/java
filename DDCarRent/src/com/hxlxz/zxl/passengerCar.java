package com.hxlxz.zxl;

public class passengerCar extends Car {
	private String name;
	private int rentPrice;
	private int perCarry;
	public passengerCar(String name, int rentPrice, int perCarry) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.rentPrice = rentPrice;
		this.perCarry = perCarry;
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
	

}
