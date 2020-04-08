package com.bridgelabz.pattern.observer;

public class ClientTwo implements Observer{

    @Override
    public void onDataReceived() {
        System.out.println("Data received in client two");
    }

}
