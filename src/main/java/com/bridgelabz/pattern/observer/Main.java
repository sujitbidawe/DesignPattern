package com.bridgelabz.pattern.observer;

public class Main {
    public static void main(String[] args) {
        Observable subject = new SubjectOne();
        Observer clientOne = new ClientOne();
        Observer clientTwo = new ClientTwo();

        subject.register(clientOne);
        subject.register(clientTwo);

        subject.update();

    }
}
