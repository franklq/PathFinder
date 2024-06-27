/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aed.pathfinder.models;

/**
 *
 * @author JANLUVI
 */
public class TextFile extends Observer {

    private String filename;

    public TextFile(String _filename) {
        this.filename = _filename;
    }

    public void read() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void write() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(String message) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
