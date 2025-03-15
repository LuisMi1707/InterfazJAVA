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
public class Desarrollador implements TrabajadorInterfaz {
    private final String lenguaje;
    
    public Desarrollador(String lenguaje){
        this.lenguaje = lenguaje;
    }

    @Override
    public void trabajar() {
        System.out.println("El desarrollador está programando en " + lenguaje);
        System.out.println("Está escribiendo código y resolviendo problemas técnicos");
        System.out.println("También está haciendo debugging y pruebas unitarias");
    }


    
}
