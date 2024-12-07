package org.example.behaviaral.observer;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

public class OctalObserver extends Observer{
    public OctalObserver(Subject subject){
        this.subject=subject;
        subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Octal value : "+Integer.toOctalString(subject.getState()));
    }
}
