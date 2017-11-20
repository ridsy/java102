package com;

public enum Weights {
	
	coding(0.5),online(0.3),classperform(0.2);
	
	private double weight;
	
	private Weights(double weight) {
		this.weight = weight;
	}
	
	public double getWeight(){
		return weight;
	}

}
