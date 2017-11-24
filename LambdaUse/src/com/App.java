package com;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 =new Employee("Ridhi","22/01/1995",10000,Gender.F);
		Employee e2 =new Employee("Rohit","23/01/1995",15000,Gender.M);
		Employee e3 =new Employee("Akhil","22/02/1996",20000,Gender.M);
		Employee e4 =new Employee("Reena","25/03/1997",30000,Gender.F);
		
		List<Employee> employees = Arrays.asList(e1,e2,e3,e4);
		
		ItemLib lib = new ItemLib();
		lib.forEach(employees, s->System.out.println(s.getDob()));
		
		/*List<Employee> sal=lib.filter(employees, s->s.getSalary()>15000);
		
		List<String> newlist = lib.map(sal, s->s.getName());
		
		lib.forEach(sal,s->System.out.println(s));
		
		lib.forEach(newlist,s->System.out.println(s));
		*/

	}

}
