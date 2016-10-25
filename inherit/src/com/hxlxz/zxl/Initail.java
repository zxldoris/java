package com.hxlxz.zxl;

public class Initail {
	public static void main(String args[]){
		Dog dog = new Dog();
		Animal animal = new Animal();
		dog.age = 10;
		dog.name = "aa";
		dog.eat();
		System.out.println(animal.age);
	}
}
