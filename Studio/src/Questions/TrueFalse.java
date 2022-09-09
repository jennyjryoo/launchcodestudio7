package Questions;

import java.util.ArrayList;

public class TrueFalse extends Question{

    private ArrayList<String> options = new ArrayList<String>() {{
        options.add("True");
        options.add("False");
    }};

    public TrueFalse(String aQuestion, ArrayList<String> aAnswer) {
        super(aQuestion, aAnswer);
    }

    @Override
    public ArrayList<String> getOptions() {
        return options;
    }

    public int gradeQuestion (ArrayList<String> aAnswer, String studentAnswer) {
        int grade = 0;
        if(studentAnswer.equals(aAnswer.get(0))){
            grade = 1;
        }
        return grade;
    }
}
