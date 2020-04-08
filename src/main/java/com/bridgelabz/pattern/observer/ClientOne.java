package com.bridgelabz.pattern.observer;

public class ClientOne extends BaseClient{

    public ClientOne(Observable subject) {
        this.subject = subject;
    }

    @Override
    public void onDataReceived(Data data) {
        super.onDataReceived(data);
    }

    @Override
    public String getName() {
        return "Client 1";
    }

}
