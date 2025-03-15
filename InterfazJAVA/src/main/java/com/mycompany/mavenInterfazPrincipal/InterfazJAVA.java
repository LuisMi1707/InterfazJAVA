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

import Interfaces.FiguraGeometricaInterfaz;
import Implementacion.ClassFiguraGeometrica.Circulo;
import Implementacion.ClassFiguraGeometrica.Rectangulo;

import Interfaces.TrabajadorInterfaz;
import Implementacion.ClassTrabajador.Desarrollador;
import Implementacion.ClassTrabajador.Diseñador;
/**
 * 
 *
 * @author HP
 */
public class InterfazJAVA {

    public static void main(String[] args) {
        /* AnimalInterfaz */
        AnimalInterfaz miPerro = new Perro();
        System.out.println("-----------------------------------------------");
        System.out.println("\nComportamiento del perro");
        miPerro.hacerSonido();
        miPerro.mover();
        
        AnimalInterfaz miGato = new Gato();
        System.out.println("-----------------------------------------------");
        System.out.println("\nComportamiento de Gato");
        miGato.hacerSonido();
        miGato.mover();
        
        /* VehiculoInterfaz */
        VehiculoInterfaz miCoche = new Coche();
        System.out.println("-----------------------------------------------");
        System.out.println("\nEl coche:");
        miCoche.arrancar();
        miCoche.deteter();
        
        VehiculoInterfaz miBicicleta = new Bicicleta();
        System.out.println("-----------------------------------------------");
        System.out.println("\nLa bicicleta:");
        miBicicleta.arrancar();
        miBicicleta.deteter();
        
        /* PagoInterfaz */
        PagoInterfaz pagueConTarjeta = new PagoConTarjeta();
        System.out.println("-----------------------------------------------");
        System.out.println("\nPagar Con Tarjeta:");
        System.out.print("Si paga con tarjeta serán en dolares:");
        pagueConTarjeta.procesarPago(15);
        
        PagoInterfaz pagueEnEfectivo = new PagoEnEfectivo();
        System.out.println("-----------------------------------------------");
        System.out.println("\nPagar en efectivo:");
        System.out.print("Si paga en efectivo serán en dolares:");
        pagueEnEfectivo.procesarPago(19);
        
        /*FiguraGeometricaInterfaz*/
        System.out.println("-----------------------------------------------");
        FiguraGeometricaInterfaz miCirculo = new Circulo(10.0);
        System.out.println("\nCÍRCULO (radio = 10.0):");
        System.out.println("Área: " + miCirculo.area());
        System.out.println("Perímetro: " + miCirculo.perimetro());
        
        System.out.println("-----------------------------------------------");
        FiguraGeometricaInterfaz miRectangulo = new Rectangulo(8.0, 4.0);
        System.out.println("\nRECTÁNGULO (base = 8.0, altura = 4.0):");
        System.out.println("Área: " + miRectangulo.area());
        System.out.println("Perímetro: " + miRectangulo.perimetro());
        
        /*TrabajadorINterfaz*/
        System.out.println("-----------------------------------------------");
        TrabajadorInterfaz desarrollador = new Desarrollador("Java");
        System.out.println("\nACTIVIDAD DEL DESARROLLADOR:");
        desarrollador.trabajar();
        
        System.out.println("-----------------------------------------------");
        TrabajadorInterfaz diseñador = new Diseñador("UX/UI");
        System.out.println("\nACTIVIDAD DEL DISEÑADOR:");
        diseñador.trabajar();

    }
}
