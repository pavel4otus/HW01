package ru.pavel2107.otus.service;


import java.io.File;

public interface TestService {
    boolean init();
    boolean inviteStudent();
    void processTest();
    void showResult();
}
