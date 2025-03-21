
package com.mycompany.mavenInterfazPrincipal;
import Interfaces.AnimalInterfaz;
import Implementacion.ClassAnimal.Perro;
import Implementacion.ClassAnimal.Gato;

import Interfaces.VehiculoInterfaz;
import Implementacion.ClassVehiculo.Coche;
import Implementacion.ClassVehiculo.Bicicleta;

import Interfaces.PagoInterfaz;
import Implementacion.ClassPago.PagoConTarjeta;
import Implementacion.ClassPago.PagoEnEfectivo;

import Interfaces.FiguraGeometricaInterfaz;
import Implementacion.ClassFiguraGeometrica.Circulo;
import Implementacion.ClassFiguraGeometrica.Rectangulo;

import Interfaces.TrabajadorInterfaz;
import Implementacion.ClassTrabajador.Desarrollador;
import Implementacion.ClassTrabajador.Diseñador;

import Interfaces.OrdenableInterfaz;
import Implementacion.ClassOrdenable.ListaNumeros;

import Interfaces.AlimentacionInterfaz;
import Implementacion.ClassAlimentacion.Persona;
import Implementacion.ClassAlimentacion.Animal;

import Interfaces.NotificableInterfaz;
import Implementacion.ClassNotificable.CorreoElectronico;
import Implementacion.ClassNotificable.SMS;

import Interfaces.ComparableObjetoInterfaz;
import Implementacion.ClassComparableObjeto.Producto;

import Interfaces.DescontableInterfaz;
import Implementacion.ClassDescontable.DescuentoFijo;
import Implementacion.ClassDescontable.DescuentoPorcentaje;

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
        
        
        System.out.println("-----------------------------------------------");
        System.out.println("\nOrdenable");

        ListaNumeros miLista = new ListaNumeros();
        
        // Agregar números desordenados
        miLista.agregarNumero(5);
        miLista.agregarNumero(2);
        miLista.agregarNumero(8);
        miLista.agregarNumero(1);
        miLista.agregarNumero(9);
        miLista.agregarNumero(3);
        
        // Mostrar la lista antes de ordenar
        System.out.println("Antes de ordenar:");
        miLista.mostrarNumeros();
        
        // Ordenar la lista utilizando el método de la interfaz
        miLista.ordenar();
        
        // Mostrar la lista después de ordenar
        System.out.println("\nDespués de ordenar:");
        miLista.mostrarNumeros();
        
        System.out.println("-----------------------------------------------");
        AlimentacionInterfaz persona = new Persona("Carlos");
        // Probar el método comer para la persona
        System.out.println("\nCOMPORTAMIENTO ALIMENTICIO DE UNA PERSONA:");
        persona.comer();
        // Método específico de la clase Persona
        // Para acceder a este método, necesitamos hacer un casting
        ((Persona) persona).cocinar();
        
        AlimentacionInterfaz animal = new Animal("león");
        // Probar el método comer para el animal
        System.out.println("\nCOMPORTAMIENTO ALIMENTICIO DE UN ANIMAL:");
        animal.comer();
        
        // Método específico de la clase Animal
        // Para acceder a este método, necesitamos hacer un casting
        ((Animal) animal).cazar();
        
        System.out.println("-----------------------------------------------\n");

        CorreoElectronico correo = new CorreoElectronico();
        SMS mensajeTexto = new SMS();
        

        // Enviar notificación por correo electrónico
        System.out.println("NOTIFICACIÓN POR CORREO ELECTRÓNICO:");
        System.out.println(correo.enviarNotificacion());
        
        System.out.println();
        // Enviar notificación por SMS
        System.out.println("NOTIFICACIÓN POR SMS:");
        System.out.println(mensajeTexto.enviarNotificacion());

        System.out.println("-----------------------------------------------\n");
        Producto p1 = new Producto("Laptop", 1000);
        Producto p2 = new Producto("Teléfono", 500);
        
        // Comparar productos
        int resultado = p1.comparar(p2);
        
        // Mostrar resultado
        if (resultado < 0) {
            System.out.println(p1 + " es más barato que " + p2);
        } else if (resultado > 0) {
            System.out.println(p1 + " es más caro que " + p2);
        } else {
            System.out.println(p1 + " tiene el mismo precio que " + p2);
        }
        
        System.out.println("-----------------------------------------------\n");
        // Crear instancias de descuentos
        DescontableInterfaz descuentoPorcentaje = new DescuentoPorcentaje(20); // 20% de descuento
        DescontableInterfaz descuentoFijo = new DescuentoFijo(50); // $50 de descuento
        
        // Producto con precio para probar
        double precioProducto = 200;
        
        // Calcular descuentos
        double descuento1 = descuentoPorcentaje.calcularDescuento(precioProducto);
        double descuento2 = descuentoFijo.calcularDescuento(precioProducto);
        
        // Calcular precios finales
        double precioFinal1 = precioProducto - descuento1;
        double precioFinal2 = precioProducto - descuento2;
        
        // Mostrar resultados
        System.out.println("Precio original: $" + precioProducto);
        System.out.println("\nDescuento por porcentaje (20%):");
        System.out.println("Cantidad descontada: $" + descuento1);
        System.out.println("Precio final: $" + precioFinal1);
        
        System.out.println("\nDescuento fijo ($50):");
        System.out.println("Cantidad descontada: $" + descuento2);
        System.out.println("Precio final: $" + precioFinal2);

        
    }
}


    
    
    
    

    

