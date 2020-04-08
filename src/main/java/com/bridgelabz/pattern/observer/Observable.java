package com.bridgelabz.pattern.observer;

public interface Observable {

     void update(Data data);
     void register(Observer observer);

}
