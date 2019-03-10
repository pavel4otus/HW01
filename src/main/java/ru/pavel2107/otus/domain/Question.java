package ru.pavel2107.otus.domain;

import java.util.Collections;
import java.util.List;

public class Question {
    private String id;
    private String question;
    private List<String> answers;
    private int correctAnswer;

    public Question( String id, String question, List<String> answers, int correctAnswer){
        this.id          = id;
        this.question    = question;
        this.answers     = Collections.unmodifiableList( answers);
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public String getId() {
        return id;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public String toString() {
        return "Вопрос{" +
                "id='" + id + '\'' +
                ", question='" + question + '\'' +
                ", correctAnswer=" + correctAnswer +
                '}';
    }
}
