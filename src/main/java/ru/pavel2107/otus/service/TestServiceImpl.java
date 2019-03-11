package ru.pavel2107.otus.service;

import ru.pavel2107.otus.domain.Question;
import ru.pavel2107.otus.domain.Student;
import ru.pavel2107.otus.domain.TestStore;
import ru.pavel2107.otus.repository.QuestionRepository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TestServiceImpl implements TestService {

    private TestStore testStore;
    private final QuestionRepository questionRepository;

    public TestServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public boolean init(){
        questionRepository.init();
        return true;
    }

    public boolean inviteStudent(){
        String name;
        String surname;
        Scanner scanner = new Scanner( System.in);
        System.out.println( "Привет, студень!");
        System.out.println( "Пришла пора пройти тест!");
        System.out.print( "Ввведи свое имя      >"); name    = scanner.next();
        System.out.print( "Ввведи свою фамилию  >"); surname = scanner.next();

        if( name == null || surname == null){
            return false;
        }

        testStore = new TestStore( new Student( name, surname));
        return true;
    }


    public void processTest(){
        List<Question> questionList = new ArrayList<>(questionRepository.getAll());
        Scanner scanner = new Scanner( System.in);
        for( int i = 0; i < questionList.size(); i++){
            Question question = questionList.get( i);
            System.out.println( "Вопрос # " + question.getId() + " : " + question.getQuestion());
            System.out.println( "Варианты ответа");
            for( int j = 0; j < question.getAnswers().size(); j++ ) {
                System.out.println( "  " + (j+1) + ")" + question.getAnswers().get( j )) ;
            }
            System.out.print( "Введите номер ответа: "); int answer = scanner.nextInt();
            testStore.addAnswer( question.getId(), answer);
        }
    }

    public void showResult(){
        List<Question> questionList = new ArrayList<>(questionRepository.getAll());
        int correctAnswers = 0;
        System.out.println( "Результаты тестирования " + testStore.getStudent().toString());
        for( Question question : questionList){
            System.out.println( question.toString());
            int studentAnswer = testStore.getAnswers().get( question.getId());
            System.out.print( "Вы дали ответ "  + studentAnswer );
            if( question.getCorrectAnswer() == studentAnswer){
                correctAnswers++;
                System.out.println( "         ->ай, молодца!");
            } else {
                System.out.println( "         ->лошок!");
            }
        }
        System.out.println( "Всего было " + correctAnswers + " правильных ответов.");

    }

}


