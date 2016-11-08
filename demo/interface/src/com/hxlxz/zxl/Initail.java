package com.hxlxz.zxl;

public class Initail {
	public static void main(String args[]){
		Telphone tel1 = new CellPhone();
		tel1.call();
		tel1.message();
		Telphone tel2 = new SmartPhone();
		tel2.call();
		tel2.message();
		  
		IPlayGame psp = new PSP();
		psp.playGame();
		IPlayGame tel3 = new SmartPhone();
		tel3.playGame();
		
		IPlayGame ip = new IPlayGame(){

			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("�����ڲ���");
			}
		};
		ip.playGame();
		
		new IPlayGame(){

			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("�����ڲ���2");
			}
		}.playGame();
	}
}