/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion.ClassAnimal;
import Interfaces.AnimalInterfaz;
/**
 *
 * @author HP
 */
public class Gato implements AnimalInterfaz{

    @Override
    public void hacerSonido() {
        System.out.println("Ay mi gatito miau miau");
    }

    @Override
    public void mover() {
        System.out.println("Gato huevon no se mueve");
    }
    
    
}
