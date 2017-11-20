import org.Trainee;

import com.Assessment;
import com.ClassRoomAssessment;
import com.Coding_Assessment;
import com.OnlineAssessment;

import calc.ScoreCalculator;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainee t1 = new Trainee(1,"Rohit");
		
		 Assessment co1 = new Coding_Assessment(80);
		 Assessment co2 = new OnlineAssessment(90);
		Assessment as = new ClassRoomAssessment(100);
		
		ScoreCalculator sc = new ScoreCalculator();
		sc.addAssessment(co1);
		sc.addAssessment(co2);
		sc.addAssessment(as);
		
		sc.calcFinalScore(t1);
		
		System.out.println(t1);		

	}

}
