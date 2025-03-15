/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion.ClassTrabajador;
import Interfaces.TrabajadorInterfaz;
/**
 *
 * @author HP
 */
public class Diseñador implements TrabajadorInterfaz {
    private final String especialidad;
    
    // Constructor
    public Diseñador(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void trabajar() {
        System.out.println("El diseñador está creando diseños de " + especialidad);
        System.out.println("Está haciendo bocetos y prototipos");
        System.out.println("También está revisando paletas de colores y patrones visuales");
    }
    
}
