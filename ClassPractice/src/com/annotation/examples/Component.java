package com.annotation.examples;

import com.annotation.container.HttpMethod;
import com.annotation.container.URLMapping;

public class Component {
	
	@URLMapping
	public void doSomething() {
		System.out.println("/");
	}
	
	@URLMapping(url ="/register",method = HttpMethod.POST)
	public void doRegister() {
		System.out.println("Register..");
	}
	
	
	@URLMapping(url ="/login",method = HttpMethod.GET)
	public void doLogin(String user,String pass) {
		System.out.println("Login.."+user+" "+pass);
	}
	
	

}
