/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asociacion.java;

/**
 *
 * @author educu
 */
public class Futbolista {
        private String nombre;
        private int edad;
        
        Pelota pelota; // el futbolista tiene una pelota

    public Futbolista(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        
    }
    
    public void setPelota(Pelota pelota){
    
        this.pelota = pelota;
    }

    public void saludar(){
    
        System.out.println("Hola son " + nombre + " y tengo "+ edad + " Años");
        pelota.presentarse(); //llama al método presentarse de la clase Pelota
    }
        
    public void pelotear(){
        System.out.println("Soy " + nombre + " y estoy jugando con mi pelota modelo " + pelota.getModelo());
    }    
        
    
}
