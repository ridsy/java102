package com;

import org.Trainee;


public class Coding_Assessment implements Coding_Online_Assessment {

	private double score;
	
	
	public Coding_Assessment(double score) {
		this.score = score;
	}

	@Override
	public void takeAssessment(Trainee t) {
		// TODO Auto-generated method stub
		System.out.println("Trainee id="+t.getId()+" "+t.getName()+" took coding assessment");

	}

	@Override
	public void showScore(Trainee t) {
		// TODO Auto-generated method stub
		System.out.println("Score = "+score);
		
	}

	@Override
	public double calcWeightedScore(Trainee t) {
		// TODO Auto-generated method stub
		return score*Weights.coding.getWeight();

	}

}
