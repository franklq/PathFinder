/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aed.pathfinder.models;

/**
 *
 * @author JANLUVI
 */
public class WriteTextCommand implements UndoableCommand {

    private FileComponent file;
    private String data;
    private String previousData;

    public WriteTextCommand(FileComponent file, String data) {
        this.file = file;
        this.data = data;
        this.previousData = "";
    }

    public void execute() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public void undo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public void redo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
