/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aed.pathfinder.models;

/**
 *
 * @author JANLUVI
 */
public class ConsoleObserver extends Observer {
    @Override
    public void update(String message) {
        System.out.println("ConsoleObserver: " + message);
    }
}