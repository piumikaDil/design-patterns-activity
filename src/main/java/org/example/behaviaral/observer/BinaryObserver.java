package org.example.behaviaral.observer;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

public class BinaryObserver extends  Observer{

    public BinaryObserver(Subject subject){
        this.subject=subject;
        subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Bianry value : "+Integer.toBinaryString(subject.getState()));
    }
}
