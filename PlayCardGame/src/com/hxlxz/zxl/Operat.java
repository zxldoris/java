package com.hxlxz.zxl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Operat {
	public List<Cards> cards;
	public Operat(){
		this.cards = new ArrayList<Cards>();
	}
	public static void main(String [] args){
		Operat o = new Operat();
		o.creatCards();
	}
	
	@Override
	public String toString() {
		return "Operat [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public void creatCards(){
		String[] color = {"����","����","÷��","��Ƭ"};
		String[] point = {"A","1","2","3","4","5","6","8","9","10","J","Q","K"};
		Cards[] c = new Cards[52];
		int k = 0;
		for(int i = 0; i < color.length; i++)
			for(int j = 0; j < point.length; j++){
				c[k] = new Cards(color[i],point[j]);
				k++;
			}
		cards.addAll(Arrays.asList(c));
		for(int i = 0; i<c.length; i++){
			System.out.println(cards.get(i).color+cards.get(i).point);
		}
		
	}
	public void distCards(){
		
	}
	public void compareCards(){
		
	}
}
