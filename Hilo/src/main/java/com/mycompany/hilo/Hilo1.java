/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hilo;

/**
 *
 * @author tere
 */
public class Hilo1 implements Runnable {
    Thread hilo;
    
    public Hilo1(String nombre){
        hilo = new Thread(this, nombre);
    }

    public static Hilo1 crearYComenzar (String nombre){
        Hilo1 miHilo = new Hilo1(nombre);
        miHilo.hilo.start();
        return miHilo;
    }
    
    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println("Tiempo restante: " + i + " segundos");
                Thread.sleep(1000); // Espera 1 segundo
            }
            System.out.println("Tiempo terminado. El programa ha finalizado");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
