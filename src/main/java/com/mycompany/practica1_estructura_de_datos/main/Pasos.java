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
public class Pasos {
    private int pasosIngreso;
    private float tiempoIngreso;
    private int pasosVerificacion;
    private float tiempoVerificacion;
    private int pasosResultado;
    private float tiempoResultado;

    public Pasos() {
    }

    public Pasos(int pasosIngreso, float tiempoIngreso, int pasosVerificacion, float tiempoVerificacion, int pasosResultado, float tiempoResultado) {
        this.pasosIngreso = pasosIngreso;
        this.tiempoIngreso = tiempoIngreso;
        this.pasosVerificacion = pasosVerificacion;
        this.tiempoVerificacion = tiempoVerificacion;
        this.pasosResultado = pasosResultado;
        this.tiempoResultado = tiempoResultado;
    }

    public int getPasosIngreso() {
        return pasosIngreso;
    }

    public void setPasosIngreso(int pasosIngreso) {
        this.pasosIngreso = pasosIngreso;
    }

    public float getTiempoIngreso() {
        return tiempoIngreso;
    }

    public void setTiempoIngreso(float tiempoIngreso) {
        this.tiempoIngreso = tiempoIngreso;
    }

    public int getPasosVerificacion() {
        return pasosVerificacion;
    }

    public void setPasosVerificacion(int pasosVerificacion) {
        this.pasosVerificacion = pasosVerificacion;
    }

    public float getTiempoVerificacion() {
        return tiempoVerificacion;
    }

    public void setTiempoVerificacion(float tiempoVerificacion) {
        this.tiempoVerificacion = tiempoVerificacion;
    }

    public int getPasosResultado() {
        return pasosResultado;
    }

    public void setPasosResultado(int pasosResultado) {
        this.pasosResultado = pasosResultado;
    }

    public float getTiempoResultado() {
        return tiempoResultado;
    }

    public void setTiempoResultado(float tiempoResultado) {
        this.tiempoResultado = tiempoResultado;
    }
    
    

}
