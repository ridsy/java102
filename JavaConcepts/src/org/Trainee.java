package org;

public class Trainee {
	
	private int id;
	private String name;
	private double marks;
	public Trainee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + ", final_score=" + marks + "]";
	}
	
	

}
