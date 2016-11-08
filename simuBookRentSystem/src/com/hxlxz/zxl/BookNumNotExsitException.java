package com.hxlxz.zxl;

public class BookNumNotExsitException extends Exception {
	public BookNumNotExsitException(){
		
	}
	public BookNumNotExsitException(String message){
		super(message);
	}
}
