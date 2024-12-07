package org.example.behaviaral.observer;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);

        subject.setState(2);
        subject.setState(20);
    }
}
