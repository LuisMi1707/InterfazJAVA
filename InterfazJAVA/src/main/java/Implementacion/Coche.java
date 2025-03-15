/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion;
import Interfaces.VehiculoInterfaz;
/**
 *
 * @author HP
 */
public class Coche implements VehiculoInterfaz{

    @Override
    public void arrancar() {
        System.out.println("Arranca de 0km a 100km en 3 segundos.");
    }

    @Override
    public void deteter() {
        System.out.println("Se detiene en un margen de 15 metros.");
    }
    
    
}
