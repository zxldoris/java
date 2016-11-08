package com.hxlxz.zxl;

public class BookNameNotExsitException extends Exception {
	public BookNameNotExsitException(){
		
	}
	public BookNameNotExsitException(String message){
		super(message);
	}
}
