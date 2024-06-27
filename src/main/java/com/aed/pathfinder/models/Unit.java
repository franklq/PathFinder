/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aed.pathfinder.models;

/**
 *
 * @author kterv
 */
public class Unit {

    private String name;
    private DirectoryComposite rootDirectory;

    public Unit(String name) {
        this.name = name;
    }

    public String getName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public DirectoryComposite getRootDirectory() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRootDirectory(DirectoryComposite rootDirectory) {
        this.rootDirectory = rootDirectory;
    }

}
