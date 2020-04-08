package com.bridgelabz.pattern.observer;

public class Main {
    public static void main(String[] args) {
        Observable subject = new SubjectOne();
        Observer clientOne = new ClientOne(subject);
        Observer clientTwo = new ClientTwo(subject);
        Data data = new Data("First client data");
        subject.register(clientOne);
        subject.register(clientTwo);

        subject.update(data);

    }
}
