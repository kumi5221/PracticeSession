package demo;
import java.util.ArrayList;
import java.util.List;

import quiz.Quiz;

public class Demo {
	public static void main(String[] args) {
		List<Quiz> quizzes = new ArrayList<Quiz>();
		quizzes.add(Quiz.getQuiz(95));
		quizzes.add(Quiz.getQuiz(50));
		quizzes.add(Quiz.getQuiz(75));
		for (Quiz quiz : quizzes) {
			System.out.print(quiz.grade());
		}
		System.out.println();
	}
}
