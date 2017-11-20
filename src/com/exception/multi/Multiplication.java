package com.exception.multi;

public class Multiplication {
	
	static int result =1;
	
	public static void multiply(int []num)throws MultiplicationException{
		
		for(int number:num) {
		if(number <= 0)
			throw new MultiplicationException("Number less than equalto 0");
		
		result *=number;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int numbers [] = {9,8,0,2,-1,3};
			
				try {
					multiply(numbers);
				} catch (MultiplicationException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				System.out.println(result);
			
			
		
	}


}
