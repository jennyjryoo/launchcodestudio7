import Questions.Question;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    public ArrayList<Question> quizQuestions = new ArrayList<>();

    public void addQuestion(Question question) {
        this.quizQuestions.add(question);
    }
    Scanner input = new Scanner();

    public void getQuestions(){
        for (Question question : quizQuestions) {
            System.out.println(question.getQuestion());
            System.out.println(question.getOptions());

        }

    }
}
