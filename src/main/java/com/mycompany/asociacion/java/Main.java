/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.asociacion.java;

/**
 *
 * @author educu
 */
public class Main {

    public static void main(String[] args) {
       
        Futbolista f1 = new Futbolista("Cumbi", 62);
        Pelota p1 = new Pelota("Adidas", "Brazuca", f1); //f1 es el futbolista 1
        
        f1.saludar();
        
        Futbolista f2 = new Futbolista("Pacholo", 22);
        Pelota p2 = new Pelota("Pollito", "Plumifero", f2); //f1 es el futbolista 2
        f2.saludar(); //llama al método saludar
    }
}
