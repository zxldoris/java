package com.hxlxz.zxl;

public class BookNotExsitException extends Exception {
	public BookNotExsitException(){
		
	}
	public BookNotExsitException(String message){
		super(message);
	}
}
