package Questions;

import java.util.ArrayList;

public class MultipleChoice extends Question {

    private ArrayList<String> options;

    public MultipleChoice(String aQuestion, ArrayList<String> aAnswer, ArrayList<String> aOptions) {
        super(aQuestion, aAnswer);
        options = aOptions;
    }

    @Override
    public ArrayList<String> getOptions() {
        return options;
    }

    public int gradeQuestion (ArrayList<String> aAnswer, String studentAnswer) {
        int grade;
        if (aAnswer.contains(studentAnswer)) {
            grade = 1;
        } else {
            grade = 0;
        }
        return grade;
    }

}
