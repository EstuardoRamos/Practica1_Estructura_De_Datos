/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.practica1_estructura_de_datos.main;

import static java.lang.Math.random;

/**
 * 
 * @author Estuardo Ramos
 */
public class Main {
    
    Apuesta ganadores;
    private int punteo;
    
    /*private int caballo1;
    private int caballo2;
    private int caballo3;
    private int caballo4;
    private int caballo5;*/
    private int caballos[] = new int[10];
    
    
    public static void main(String[] args) {
        /*Main main = new Main();
        //main.carrera();
        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] a2 = {1, 2, 3, 4, 5, 1, 7, 8, 9, 10};
        int[] a3 = {7, 2, 4, 4, 5, 6, 7, 8, 9, 10};
        int[] a4 = {1, 1, 4, 4, 5, 6, 7, 8, 9, 10};
        int[] a5 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Es repetido? "+tieneRepetidos(a1));
        System.out.println("Es repetido? "+tieneRepetidos(a2));
        System.out.println("Es repetido? "+tieneRepetidos(a3));
        System.out.println("Es repetido? "+tieneRepetidos(a4));
        System.out.println("Es repetido? "+tieneRepetidos(a5));*/
        
    }
    
    public void verificar(){
        
    }
    
    
    
    public void carrera(){
        System.out.println("Iniciando metodo");
        for (int i = 0; i < 10; i++) {
             caballos[i]=i+1;
             
            
             /*while (i==0 ||caballos[i]==caballos[i-1]){
                 caballos[i]=(int) (Math.random()*(10-1)) +1;
                System.out.println("asignando");
             }*/
            
            System.out.println("Caballos "+i+"  "+caballos[i]);
        }
        /*Apuesta[] participantes = new Apuesta[6];
        participantes[0] = new Apuesta(1, 3, 4, 7, 8, 9, 10, 2, 5,6, 150, "Estuardo");
        participantes[1] = new Apuesta(2, 1, 4, 7, 8, 9, 10, 3, 5,6, 150, "Maria");
        participantes[2] = new Apuesta(5, 3, 4, 7, 8, 9, 10, 2, 1,6, 150, "Pedro");
        participantes[3] = new Apuesta(10, 3, 4, 7, 8, 9, 1, 2, 5,6, 150, "Carlos");
        participantes[4] = new Apuesta(9, 3, 7, 4, 8, 1, 10, 2, 5,6, 150, "Loren");
        participantes[5] = new Apuesta(1, 3, 4, 7, 8, 9, 10, 2, 6,5, 150, "Karla");*/
        
        int prueba[]= new int[10];
        prueba[0]=1;
        prueba[1]=2;
        prueba[2]=3;
        prueba[3]=4;
        prueba[4]=5;
        prueba[5]=6;
        prueba[6]=7;
        prueba[7]=8;
        prueba[8]=9;
        prueba[9]=10;
        Apuesta jug1= new Apuesta();
        Apuesta jug2= new Apuesta();
        Apuesta jug3= new Apuesta();
        Apuesta jug4= new Apuesta();
        jug1.setNombre("stuar");
        jug1.setDineroApuesta(1500);
        jug1.setPuestos(prueba);
        
        
        
        
    }
    
    public static boolean tieneRepetidos(int[] a1, int pasosVer){
        //if(participantes[1].getPuesto1())
        boolean pr = false;
        
        for (int i = 0; i < a1.length ; i++) {
            pasosVer++;
            for (int j = 0; j < a1.length ; j++) {
                if (i!=j && a1[i]==a1[j]) {
                    pasosVer++;
                    return true;
                }
            }
            
        }
        
     return false;
    }
    
    
    
   /* private void comprobarGanadores(Apuesta[] apuestas){
        if (ganadores.getPuesto1()==apuestas[1].getPuesto1()) {
            punteo=10;
        }
        if (ganadores.getPuesto2()==apuestas[2].getPuesto1()) {
            punteo=9;
        }
        if (ganadores.getPuesto3()==apuestas[3].getPuesto1()) {
            punteo=8;
        }
        if (ganadores.getPuesto4()==apuestas[4].getPuesto1()) {
            punteo=7;
        }
        if (ganadores.getPuesto5()==apuestas[5].getPuesto1()) {
            punteo=6;
        }
        if (ganadores.getPuesto6()==apuestas[6].getPuesto1()) {
            punteo=5;
        }
        if (ganadores.getPuesto7()==apuestas[7].getPuesto1()) {
            punteo=4;
        }
        if (ganadores.getPuesto8()==apuestas[8].getPuesto1()) {
            punteo=3;
        }
    }*/
}
