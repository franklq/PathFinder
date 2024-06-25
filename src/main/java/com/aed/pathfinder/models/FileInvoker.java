/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aed.pathfinder.models;

import java.util.Stack;

/**
 *
 * @author kterv
 */
public class FileInvoker {

    private Stack<UndoableCommand> commandHistory;
    private Stack<UndoableCommand> redoStack;
    private FileInvoker instance;

    public FileInvoker getInstance() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void executeCommand(Command command) {
    }

    public void undo() {
    }

    public void redo() {
    }

    public Stack<UndoableCommand> getCommandHistory() {
        return commandHistory;
    }

    public void setCommandHistory(Stack<UndoableCommand> commandHistory) {
        this.commandHistory = commandHistory;
    }

    public Stack<UndoableCommand> getRedoStack() {
        return redoStack;
    }

    public void setRedoStack(Stack<UndoableCommand> redoStack) {
        this.redoStack = redoStack;
    }

}
