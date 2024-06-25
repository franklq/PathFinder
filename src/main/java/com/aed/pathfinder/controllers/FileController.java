package com.aed.pathfinder.controllers;

/**
 *
 * @author Juan Romero Collazos
 */
public class FileController {
    private FileService fileService; //utiliza un servicio para las operaciones con archivos.
    private PathFinder pathFinder;
    private Bloc bloc;
    private FileInvoker fileInvoker;

    public FileController(FileService fileService, PathFinder pathFinder, Bloc bloc, FileInvoker fileInvoker) {
        this.fileService = fileService;
        this.pathFinder = pathFinder;
        this.bloc = bloc;
        this.fileInvoker = fileInvoker;
    }

    // Agregar archivo
    public void addFile(String directoryName, String filename) {
        Command command = new AddFileCommand(fileService, directoryName, filename);
        fileInvoker.executeCommand(command);
    }

    // Eliminar archivo
    public void removeFile(String directoryName, String filename) {
        Command command = new RemoveFileCommand(fileService, directoryName, filename);
        fileInvoker.executeCommand(command);
    }

    // Leer archivo
    public void readFile(String filename) {
        String content = fileService.readFile(filename);
        System.out.println(content);
    }

    // Escribir archivo
    public void writeFile(String filename, String data) {
        fileService.writeFile(filename, data);
    }

    //para mostrar la estructura del sistema de archivos.
    public void displayStructure() {
        fileService.displayStructure();
    }

    public void displayStructure(FileComponent component, String ident) {
        fileService.displayStructure(component, ident);
    }

    //deshacer la última operación
    public void undo() {
        if (!undoStack.isEmpty()) {
            Command command = undoStack.pop();
            command.undo();
            redoStack.push(command);
        }
    }

    //rehacer la última operación deshecha
    public void redo() {
        if (!redoStack.isEmpty()) {
            Command command = redoStack.pop();
            command.redo();
            undoStack.push(command);
        }
    }
}
