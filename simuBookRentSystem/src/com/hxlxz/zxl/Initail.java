package com.hxlxz.zxl;

import java.util.Scanner;

public class Initail {

	int flag=0;
	static String[] books = {"����","���ݽṹ","����","Ӣ��"};
	public static void main(String[] args){
		int findBook=0;
		System.out.println("�������1-�������Ʋ���ͼ�飻2-������Ų���ͼ��.");
		
		/**************************���Բ���**********************************
		******************************************************************/
		
		/**************************���Բ���**********************************
		******************************************************************/	
		Initail findWay = new Initail();
		while(true){
			try{
				findBook = findWay.InputFindWay();
				break;
			}catch(InputErrorException iee){
				iee.printStackTrace();
				System.out.println("���������ȷ�����������룺");
			}
		}
		
		if(findBook == 1){	//name
			System.out.println("������ͼ�����ƣ�");
			Initail fb = new Initail();
			while(true){
				try{
					fb.findName();
					break;
				}catch(BookNameNotExsitException bnnee){
					bnnee.printStackTrace();
					System.out.println("ͼ�鲻���ڣ�");
				}
			}
		}else{
			int bookNum=0;
			System.out.println("������ͼ����ţ�");
			Initail fb2 = new Initail();
			while(true){
				try{
					bookNum = fb2.findNum();
					break;
				}catch(BookNumNotExsitException bnnee){
					bnnee.printStackTrace();
					System.out.println("��������ȷ������������ͼ����ţ�");
				}catch(BookNotExsitException bnee){
					bnee.printStackTrace();
					System.out.println("ͼ�鲻���ڣ�");
				}
			}
			System.out.println("book��"+books[bookNum]);
		}	
	}
	private int InputFindWay() throws InputErrorException{
		int bookFind;
		Scanner sc = new Scanner(System.in);
		bookFind = sc.nextInt();
		if(bookFind!=1 && bookFind!=2){
			throw new InputErrorException();
		}
		return bookFind;
	}
	private int findNum() throws BookNumNotExsitException,BookNotExsitException{
		int bookNum=0;
		Scanner bn2 = new Scanner(System.in);
		bookNum = bn2.nextInt()-1;
		if(bookNum>9||bookNum<0){
			throw new BookNumNotExsitException();
		}
		if(bookNum>books.length){
			throw new BookNotExsitException();
		}
		return bookNum;
	}
	private void findName() throws BookNameNotExsitException{
		String  bookName=null;
		Scanner bn = new Scanner(System.in);
		bookName = bn.nextLine();
		for(int i=0;i<books.length;i++){
			if(bookName.equals(books[i])){
				System.out.println("book:"+books[i]);
				flag = 1;
				break;
			}
		}
		if(flag == 0){
			throw new BookNameNotExsitException();
		}else{
			
		}
	}

}