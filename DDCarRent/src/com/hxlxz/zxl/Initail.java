package com.hxlxz.zxl;

import java.util.Scanner;

public class Initail {

	static Car[] carRentTabs;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumPriceDaily=0, sumPer=0, sumGoods=0, sumPrice;
		int[] carNum;
		carNum = new int[7];
		System.out.println("��ӭʹ�����⳵ϵͳ��");
		System.out.println("�Ƿ���Ҫ�⳵��1�� 0��");
		Scanner sc = new Scanner(System.in);
		while(true){
			int rentWether = sc.nextInt();
			if(rentWether == 1){
				displayTabs();
				break;
			}else if(rentWether == 0){
				System.out.println("ллʹ�ã�");
				break;
			}else{
				System.out.println("�����������������:");
			}
		}
		System.out.println("\n");
		System.out.println("�������⳵������\n");
		int rentNum = sc.nextInt();
		
		for(int i=0;i<rentNum;i++){
			System.out.println("�������"+(i+1)+"����");
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
		System.out.println("�������⳵������\n");
		int NumofDays = sc.nextInt();
		sumPrice = sumPriceDaily * NumofDays;
		System.out.println("�����˵ĳ���\n");
		for(int i=0;i<rentNum;i++){
			if(carRentTabs[carNum[i]].getGoodsCarry()!=0){
				System.out.println(carRentTabs[carNum[i]].getName());
			}else{
			}
		}
		System.out.println("����������"+sumPer);
		System.out.println("���ػ��ĳ���\n");
		for(int i=0;i<rentNum;i++){
			if(carRentTabs[carNum[i]].getPerCarry()!=0){
				System.out.println(carRentTabs[carNum[i]].getName());
			}else{
			}
		}
		System.out.println("���ػ���"+sumGoods);
		System.out.println("�����"+sumPrice);
		
	}
	public static void displayTabs(){
		carRentTabs = new Car[]{new passengerCar("�µ�A4",500,4), new passengerCar("���Դ�6",400,4),
				new passengerCar("����",800,20), new PickUp("Ƥ��ѩ6",450,4,2), new Truck("�ɻ���",400,4), 
				new Truck("��ά��",1000,20)};
		System.out.println("����\t\t���\t\t������\t\t�ػ���");
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