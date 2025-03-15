/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenInterfazPrincipal;
import Interfaces.AnimalInterfaz;
import Implementacion.Perro;
import Implementacion.Gato;

import Interfaces.VehiculoInterfaz;
import Implementacion.Coche;
import Implementacion.Bicicleta;

import Interfaces.PagoInterfaz;
import Implementacion.PagoConTarjeta;
import Implementacion.PagoEnEfectivo;
/**
 *
 * @author HP
 */
public class InterfazJAVA {

    public static void main(String[] args) {
        AnimalInterfaz miPerro = new Perro();
        System.out.println("-----------------------------------------------");
        System.out.println("Comportamiento del perro");
        miPerro.hacerSonido();
        miPerro.mover();
        
        AnimalInterfaz miGato = new Gato();
        System.out.println("-----------------------------------------------");
        System.out.println("Comportamiento de Gato");
        miGato.hacerSonido();
        miGato.mover();
        
        /* VehiculoInterfaz */
        VehiculoInterfaz miCoche = new Coche();
        System.out.println("-----------------------------------------------");
        System.out.println("El coche:");
        miCoche.arrancar();
        miCoche.deteter();
        
        VehiculoInterfaz miBicicleta = new Bicicleta();
        System.out.println("-----------------------------------------------");
        System.out.println("La bicicleta:");
        miBicicleta.arrancar();
        miBicicleta.deteter();
        
        /* PagoInterfaz */
        PagoInterfaz pagueConTarjeta = new PagoConTarjeta();
        System.out.println("-----------------------------------------------");
        System.out.println("Pagar Con Tarjeta:");
        System.out.print("Si paga con tarjeta serán en dolares:");
        pagueConTarjeta.procesarPago(15);
        
        PagoInterfaz pagueEnEfectivo = new PagoEnEfectivo();
        System.out.println("-----------------------------------------------");
        System.out.println("Pagar en efectivo:");
        System.out.print("Si paga en efectivo serán en dolares:");
        pagueEnEfectivo.procesarPago(19);
    }
}
