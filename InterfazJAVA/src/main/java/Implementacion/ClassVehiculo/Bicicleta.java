/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion.ClassVehiculo;
import Interfaces.VehiculoInterfaz;
/**
 *
 * @author HP
 */
public class Bicicleta implements VehiculoInterfaz{

    @Override
    public void arrancar() {
        System.out.println("Arranca mucho mas lento que el coche.");
    }

    @Override
    public void deteter() {
        System.out.println("Frena mas rapido que el coche.");
    }
    
    
}
