package ru.pavel2107.otus.repository;

import ru.pavel2107.otus.domain.Question;

import java.util.Collection;
import java.util.List;

public interface QuestionRepository {

    void init();

    Question get( String id);
    Question save( Question question);
    Question delete( Question question);
    Collection<Question> getAll();
}
