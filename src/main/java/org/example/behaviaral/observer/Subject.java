package org.example.behaviaral.observer;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyToallObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyToallObservers(){
        for (Observer observer:observers) {
            observer.update();
        }
    }
}
