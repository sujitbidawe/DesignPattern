package com.bridgelabz.pattern.observer;

public class ClientOne implements Observer{

    @Override
    public void onDataReceived() {
        System.out.println("Data received in client one");
    }

}
