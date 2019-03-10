package ru.pavel2107.otus.domain;

import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;

public class Student {
    private String id;
    private String name;
    private String surname;

    public Student(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.id      = surname + ":" + name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getId(){ return id;}

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
