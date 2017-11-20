package calc;

import java.util.ArrayList;
import java.util.List;

import org.Trainee;

import com.Assessment;
import com.Coding_Online_Assessment;

public class ScoreCalculator {
	
	private List<Assessment> assessments = new ArrayList<>();
	
	public void addAssessment(Assessment assessment) {
		assessments.add(assessment);
	}

	public void removeAssessment(Assessment assessment) {
		assessments.remove(assessment);
	}
	
	public void calcFinalScore(Trainee t) {
		
		double marks =0;
		for(Assessment a:assessments) {
			if(a instanceof Coding_Online_Assessment) {
				((Coding_Online_Assessment) a).takeAssessment(t);
			}
			a.showScore(t);
			marks += a.calcWeightedScore(t);
				
		}
		t.setMarks(marks);
	}
	

}
