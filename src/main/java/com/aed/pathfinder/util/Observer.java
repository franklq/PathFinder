package com.aed.pathfinder.util;

/**
 *
 * @author kterv
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update(String message);
}
