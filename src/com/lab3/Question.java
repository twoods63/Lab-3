package com.lab3;

public class Question {
    private String question;
    private String answer;
    private int difficulty;

    // Constructor
    public Question(String question, String answer, int difficulty) {
        super();
        this.question = question;
        this.answer = answer;
        this.difficulty = difficulty;
    }
    // Getters
    public String getQuestion() {
        return question;
    }
    public String getAnswer() {
        return answer;
    }
    public int getDifficulty() {
        return difficulty;
    }
    // Setters
    public void setQuestion(String question) {
        this.question = question;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}
