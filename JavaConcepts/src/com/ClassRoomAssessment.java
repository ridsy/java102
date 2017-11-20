package com;

import org.Trainee;

public class ClassRoomAssessment implements Assessment {

    private double score;
    
	public ClassRoomAssessment(double score) {
		this.score = score;
	}

	@Override
	public void showScore(Trainee t) {
		// TODO Auto-generated method stub
		System.out.println("ClassroomScore = "+score);

	}

	@Override
	public double calcWeightedScore(Trainee t) {
		// TODO Auto-generated method stub
		return score*Weights.classperform.getWeight();

	}

}
