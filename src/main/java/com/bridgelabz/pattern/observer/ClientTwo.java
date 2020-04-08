package com.bridgelabz.pattern.observer;

public class ClientTwo extends BaseClient{

    public ClientTwo(Observable subject) {
        this.subject = subject;
    }

    @Override
    public void onDataReceived(Data data) {
        super.onDataReceived(data);
    }

    @Override
    public String getName() {
        return "Client 2";
    }

}
