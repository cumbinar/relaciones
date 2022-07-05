/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asociacion.java;

/**
 *
 * @author educu
 */
public class Pelota {
    private String marca;
    private String modelo;
    
    Futbolista futbolista; //la pelota tiene un dueño

    public Pelota(String marca, String modelo, Futbolista futbolista) {
        this.marca = marca;
        this.modelo = modelo;
        this.futbolista = futbolista;
        futbolista.setPelota(this);
    }

    public String getModelo() {
        return modelo;
    }

    
    
    public void presentarse(){
       System.out.println("Soy la pelota "+ marca + " modelo "+ modelo);
       futbolista.pelotear();
    }
    
    
}
