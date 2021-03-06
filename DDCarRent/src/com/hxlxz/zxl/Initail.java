package com.hxlxz.zxl;

import java.util.Scanner;

public class Initail {

	static Car[] carRentTabs;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumPriceDaily=0, sumPer=0, sumGoods=0, sumPrice;
		int[] carNum;
		carNum = new int[7];
		System.out.println("欢迎使用嗒嗒租车系统！");
		System.out.println("是否需要租车：1是 0否");
		Scanner sc = new Scanner(System.in);
		while(true){
			int rentWether = sc.nextInt();
			if(rentWether == 1){
				displayTabs();
				break;
			}else if(rentWether == 0){
				System.out.println("谢谢使用！");
				break;
			}else{
				System.out.println("输入错误，请重新输入:");
			}
		}
		System.out.println("\n");
		System.out.println("请输入租车数量：\n");
		int rentNum = sc.nextInt();
		
		for(int i=0;i<rentNum;i++){
			System.out.println("请输入第"+(i+1)+"辆车");
			carNum[i] = sc.nextInt()-1;	
		}
		for(int i=0;i<rentNum;i++){
			sumPriceDaily += carRentTabs[carNum[i]].getRentPrice();
			if(carRentTabs[carNum[i]] instanceof passengerCar){
				sumPer += carRentTabs[carNum[i]].getPerCarry();
			}else if(carRentTabs[carNum[i]] instanceof Truck){
				sumGoods += carRentTabs[carNum[i]].getGoodsCarry();
			}else{
				sumPer += carRentTabs[carNum[i]].getPerCarry();
				sumGoods += carRentTabs[carNum[i]].getGoodsCarry();
			}
		}
		System.out.println("请输入租车天数：\n");
		int NumofDays = sc.nextInt();
		sumPrice = sumPriceDaily * NumofDays;
		System.out.println("可载人的车：\n");
		for(int i=0;i<rentNum;i++){
			if(carRentTabs[carNum[i]].getGoodsCarry()!=0){
				System.out.println(carRentTabs[carNum[i]].getName());
			}else{
			}
		}
		System.out.println("总载人量："+sumPer);
		System.out.println("可载货的车：\n");
		for(int i=0;i<rentNum;i++){
			if(carRentTabs[carNum[i]].getPerCarry()!=0){
				System.out.println(carRentTabs[carNum[i]].getName());
			}else{
			}
		}
		System.out.println("总载货量"+sumGoods);
		System.out.println("总租金："+sumPrice);
		
	}
	public static void displayTabs(){
		carRentTabs = new Car[]{new passengerCar("奥迪A4",500,4), new passengerCar("马自达6",400,4),
				new passengerCar("金龙",800,20), new PickUp("皮卡雪6",450,4,2), new Truck("松花江",400,4), 
				new Truck("依维柯",1000,20)};
		System.out.println("名称\t\t租金\t\t载人量\t\t载货量");
		for(int i=0;i<6;i++){
			System.out.println((i+1)+".");
			if(carRentTabs[i] instanceof passengerCar){
				System.out.println(carRentTabs[i].getName()+"\t\t"+carRentTabs[i].getRentPrice()+"\t\t"+carRentTabs[i].getPerCarry());
			}else if(carRentTabs[i] instanceof Truck){
				System.out.println(carRentTabs[i].getName()+"\t\t"+carRentTabs[i].getRentPrice()+"\t\t\t\t"+carRentTabs[i].getGoodsCarry());
			}else{
				System.out.println(carRentTabs[i].getName()+"\t\t"+carRentTabs[i].getRentPrice()+"\t\t"+carRentTabs[i].getPerCarry()+"\t\t"+carRentTabs[i].getGoodsCarry());
			}
		}
		
	}
}
