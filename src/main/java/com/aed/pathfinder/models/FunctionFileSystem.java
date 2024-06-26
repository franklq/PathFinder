/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aed.pathfinder.models;

/**
 *
 * @author JANLUVI
 */
 interface FunctionFileSystem {
    public void exportFileOrDirectory(String filename, String path);
    public void importSAVFile(String path);
    public void saveSAVFile(String filename);
    
}
