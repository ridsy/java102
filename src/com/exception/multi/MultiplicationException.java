package com.exception.multi;

@SuppressWarnings("serial")
public class MultiplicationException extends Exception {
String arg0;
	public MultiplicationException(String arg0) {
		super(arg0);
		this.arg0=arg0;
				
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return arg0;
	}
	
	

}
