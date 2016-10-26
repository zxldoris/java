package com.hxlxz.splice;

import java.util.*;

public class Splice {

	private static Scanner input;

	public static void main(String[] args) {

		int age = 11;

		String greeting = "   Hello!   ";
		String s = greeting.substring(0, 3);
		String rating = "PG" + " " + age;
		String string = greeting + s + rating;
		String greet = greeting.substring(3, 5);// String类对象称为不可变字符串
		StringBuilder builder = new StringBuilder();

		//Console
		
		//Scanner
		input = new Scanner(System.in);
		System.out.println("what is your name?");
		String name = input.nextLine();
		System.out.println("How old are you?");
		int age1 = input.nextInt();
		System.out.println("name: " + name + "   age: " + age1);
		
		// StringBuilder
		System.out.println("builder append: " + builder.append("helloworld!"));
		System.out.println("builder append: " + builder.append(greeting));
		System.out.println("builder length: " + builder.length());
		System.out.println("appendcodepoint: " + builder.appendCodePoint(101));
		builder.setCharAt(0, 'H');
		System.out.println("setCharAt: " + builder);
		System.out.println("insert: " + builder.insert(0, 'H'));
		System.out.println("delete: " + builder.delete(0, 1));
		System.out.println("toString: " + builder.toString());

		// String
		System.out.println("trim :" + greeting.trim());
		System.out.println("greeting length: " + greeting.length());
		System.out.println("charAt: " + greeting.charAt(1));
		System.out.println("code point at: " + greeting.codePointAt(1));
		System.out.println("offsetByCodePoint: " + greeting.offsetByCodePoints(1, 2));
		System.out.println("compareto： " + greeting.compareTo("Hello"));
		System.out.println("end with： " + greeting.endsWith("o"));
		System.out.println("equals: " + greeting.equals("Hello"));
		System.out.println("codepoint count: " + greeting.codePointCount(1, 5));
		System.out.println();
		System.out.println(greeting);
		System.out.println(s);
		System.out.println(s + "p");
		System.out.println(rating);
		System.out.println(greeting + s + rating);// “+”相当于是一个字符串
		System.out.println(string);
		System.out.println(greet + "w");
	}
}