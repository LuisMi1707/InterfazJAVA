/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion.ClassALimentacion;
import Interfaces.AlimentacionInterfaz;
/**
 *
 * @author HP
 */
public class Animal implements AlimentacionInterfaz {
    private final String especie;
    
    public Animal(String especie) {
        this.especie = especie;

    }

    @Override
    public void comer() {
         System.out.println("El " + especie + " está comiendo según su instinto.");
        System.out.println("Busca su alimento en la naturaleza.");
        System.out.println("Come cuando tiene hambre, siguiendo su comportamiento instintivo.");
    }
    
    public void cazar() {
        System.out.println("El " + especie + " está cazando para alimentarse.");
    }
    
}
