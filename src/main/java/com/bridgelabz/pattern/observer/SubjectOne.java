package com.bridgelabz.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectOne implements Observable{

    List<Observer> observerList = new ArrayList();

    public void register(Observer client){
        observerList.add(client);
    }

    @Override
    public void onAcknowledgementReceived(Observer observer) {
        System.out.println("Acknowledgement received from " + observer.getName());
    }

    public void update(Data data){
        for (Observer client : observerList) {
            client.onDataReceived(data);
        }
    }

}

