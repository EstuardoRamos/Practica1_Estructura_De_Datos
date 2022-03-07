/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.practica1_estructura_de_datos.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Objects;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * 
 * @author Estuardo Ramos
 */
public class ManejadorArchivos {
    private String contenido;
    private String direccion;
    File archivo;
    
    public void escribirNuevo(String nuevo) {
        JFileChooser fc = new JFileChooser();
        fc.showSaveDialog(null);
        archivo = fc.getSelectedFile();
        File nuevoArch;
        direccion=""+archivo;
        System.out.println(archivo);
        
        PrintWriter printWriter = null;
        String textToBeWritten = nuevo;
        {
            try {
                printWriter = new PrintWriter(direccion);
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Error archivo no puede guasrdarse");
            }
            Objects.requireNonNull(printWriter).println(textToBeWritten);
            printWriter.close();
        }

    }
    
    public void guardarNuevo(String modificado) {
        PrintWriter printWriter = null;
        String textToBeWritten = modificado;
        {
            try {
                printWriter = new PrintWriter(archivo);
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Error archivo no puede guasrdarse");
            }
            Objects.requireNonNull(printWriter).println(textToBeWritten);
            printWriter.close();
        }

    }

}
