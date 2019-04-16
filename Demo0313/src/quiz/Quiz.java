package quiz;
import java.util.ArrayList;
import java.util.List;

public abstract class Quiz {
	public abstract String grade();
	
	// Factory method: create an object of the appropriate subclass
	public static Quiz getQuiz(int score) {
		if (score >= 90) {
			return new GoodQuiz();
		} else if (score < 60) {
			return new BadQuiz();
		} else {
			return new FairQuiz();
		}
	}
}

class GoodQuiz extends Quiz {
	public String grade() {
		return "A";
	}
}

class BadQuiz extends Quiz {
	public String grade() {
		return "F";
	}
}

class FairQuiz extends Quiz {
	public String grade() {
		return "C";
	}
}