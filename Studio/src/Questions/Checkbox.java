package Questions;

import java.util.ArrayList;

public class Checkbox extends Question {

    private ArrayList<String> options;

    public Checkbox(String aQuestion, ArrayList<String> aAnswer, ArrayList<String> aOptions) {
        super(aQuestion, aAnswer);
        options = aOptions;
    }

    @Override
    public ArrayList<String> getOptions() {
        return options;
    }

    public int gradeQuestion (ArrayList<String> aAnswer, ArrayList<String> studentAnswer) {
        int grade = 1;
        for (String answer : studentAnswer) {
            if (!aAnswer.contains(answer)){
                grade = 0;
            }
        }
        return grade;
    }
}
