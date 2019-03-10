package ru.pavel2107.otus.domain;

import java.util.Collections;
import java.util.HashMap;

public class TestStore {
    private Student student;
    private String id;
    private HashMap<String, Integer> answers;

    public TestStore(Student student){
        this.student = student;
        this.id      = student.getId();
        answers = new HashMap<>();
    }

    public void addAnswer( String question, Integer answer){
        answers.put( question, answer);
    }

    public HashMap<String, Integer> getAnswers(){
        return answers;
    }

    public String getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }
}
