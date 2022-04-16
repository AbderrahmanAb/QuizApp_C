package com.aboulfalah.quizapp_c;

public class Question {
    private String Question_name;
    public Question(){}

    public Question(String question_name) {
        Question_name = question_name;
    }

    public String getQuestion_name() {
        return Question_name;
    }

    public void setQuestion_name(String question_name) {
        Question_name = question_name;
    }
}
