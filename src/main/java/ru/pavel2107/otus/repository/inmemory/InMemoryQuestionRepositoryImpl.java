package ru.pavel2107.otus.repository.inmemory;

import ru.pavel2107.otus.domain.Question;
import ru.pavel2107.otus.repository.QuestionRepository;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryQuestionRepositoryImpl implements QuestionRepository {

    private Map<String, Question> map = new ConcurrentHashMap<>();

    @Override
    public Question get( String id) {
        return map.get( id);
    }

    @Override
    public Question save(Question question) {
        return map.put( question.getId(), question);
    }

    @Override
    public Question delete(Question question) {
        return map.remove( question.getId());
    }

    @Override
    public Collection<Question> getAll() {
        return map.values();
    }
}
