package Questions;

import java.util.ArrayList;

public class Question {

    private ArrayList<String> options;

    private String question;
    private ArrayList<String> answer;
    public Question (String aQuestion, ArrayList<String> aAnswer) {
        question = aQuestion;
        answer = aAnswer;
    }


    public String getQuestion() {
        return question;
    }

    public ArrayList<String> getAnswer() {
        return answer;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

}
