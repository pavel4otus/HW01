package ru.pavel2107.otus;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.pavel2107.otus.domain.Question;
import ru.pavel2107.otus.service.TestService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        TestService testService = context.getBean( TestService.class);

        String fileName = "test.txt";
        ClassLoader classLoader = Main.class.getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());


        testService.init( file);
        testService.inviteStudent();
        testService.processTest();
        testService.showResult();
    }
}
