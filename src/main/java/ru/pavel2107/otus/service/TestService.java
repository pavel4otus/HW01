package ru.pavel2107.otus.service;


import java.io.File;

public interface TestService {
    boolean init( File file);
    boolean inviteStudent();
    void processTest();
    void showResult();
}
