/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aed.pathfinder.models;

import java.io.File;

/**
 *
 * @author JANLUVI
 */
public class WriteCommand {

    private File file;
    private String data;

    public WriteCommand() {
    }

    public void execute() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
