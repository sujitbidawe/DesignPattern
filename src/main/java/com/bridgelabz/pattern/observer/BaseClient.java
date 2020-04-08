package com.bridgelabz.pattern.observer;

public abstract class BaseClient implements Observer {
    Observable subject;

    @Override
    public void onDataReceived(Data data) {
        System.out.println(getName() + " Data = "+ data.getMyData());
        subject.onAcknowledgementReceived(this);
    }

}
