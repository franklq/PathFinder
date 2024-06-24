package com.aed.pathfinder.util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kterv
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    public void notifyObservers(String message) {
        observers.forEach(x -> x.update(message));
    } 
}
