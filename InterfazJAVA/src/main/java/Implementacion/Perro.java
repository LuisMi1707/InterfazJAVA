/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion;

import Interfaces.AnimalInterfaz;
/**
 *
 * @author HP
 */
public class Perro implements AnimalInterfaz {

    @Override
    public void hacerSonido() {
        System.out.println("El perro hace: Guau Guau");
    }

    @Override
    public void mover() {
        System.out.println("EL perro esta corriendo");
    }
    
}
    
    
