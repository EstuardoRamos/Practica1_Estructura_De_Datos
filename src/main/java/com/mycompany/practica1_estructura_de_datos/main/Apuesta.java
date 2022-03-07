/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.practica1_estructura_de_datos.main;

/**
 * 
 * @author Estuardo Ramos
 */
public class Apuesta {
    
    private String nombre;
    private double dineroApuesta;
    private int puestos[]=new int[10];
    private int puntos;
    private boolean valido;
    
    public Apuesta() {
    }

    public Apuesta(String nombre, double dineroApuesta, int puntos, boolean valido) {
        this.nombre = nombre;
        this.dineroApuesta = dineroApuesta;
        this.puntos = puntos;
        this.valido = valido;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public boolean isValido() {
        return valido;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }
    
    public void sumarPuntos(int nuevosPuntos){
        this.puntos+=nuevosPuntos;
    }
    
    
    
    
    public int[] getPuestos() {
        return puestos;
    }

    public void setPuestos(int[] puestos) {
        this.puestos = puestos;
    }

    public double getDineroApuesta() {
        return dineroApuesta;
    }

    public void setDineroApuesta(double dineroApuesta) {
        this.dineroApuesta = dineroApuesta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    

}
