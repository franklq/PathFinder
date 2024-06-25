/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aed.pathfinder.models;

import java.util.List;

/**
 *
 * @author kterv
 */
public class DirectoryComposite {

    private String name;
    private List<FileComponent> components;

    public DirectoryComposite(String _name) {
        this.name = _name;
    }

    public void read() {
    }

    public void write(String data) {
    }

    public void read(String filename, String path) {
    }

    public void add(FileComponent fileComponent) {
    }

    public void remove(FileComponent fileComponent) {
    }

    public void getchild(int i) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FileComponent> getComponents() {
        return components;
    }

    public void setComponents(List<FileComponent> components) {
        this.components = components;
    }
}
