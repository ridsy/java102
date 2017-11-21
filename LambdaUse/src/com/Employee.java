package com;

public class Employee {
	
	private String name;
	private String dob;
	private double salary;
	private Gender gender;
	public Employee(String name, String dob, double salary, Gender gender) {
		super();
		this.name = name;
		this.dob = dob;
		this.salary = salary;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dob=" + dob + ", salary=" + salary + ", gender=" + gender + "]";
	}
	
	
	
	
	

}
