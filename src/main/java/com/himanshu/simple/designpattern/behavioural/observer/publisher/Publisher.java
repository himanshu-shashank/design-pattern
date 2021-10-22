package com.himanshu.simple.designpattern.behavioural.observer.publisher;


import com.himanshu.simple.designpattern.behavioural.observer.observer.Observer;

// This interface handles adding, deleting and updating
// all observers
public interface Publisher {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();
}
