package com.hxlxz.zxl;

public class SmartPhone extends Telphone implements IPlayGame{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("SmartPhone call!");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("SmartPhone message!");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("SmartPhone IPlayGame");
	}

}