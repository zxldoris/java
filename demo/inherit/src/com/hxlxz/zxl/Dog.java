package com.hxlxz.zxl;

public class Dog extends Animal {
	public int age = 20;
	
	@Override
	public String toString() {
		return "Dog [age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		return true;
	}

	public static void main(String args[]){
		
		Dog dog1 = new Dog();
		dog1.age = 10;
		Dog dog2 = new Dog();
		dog2.age = 10;
		if(dog1.equals(dog2))
		{
			System.out.println("相同");
		}else{
			System.out.println("不相同");
		}
	}
}
