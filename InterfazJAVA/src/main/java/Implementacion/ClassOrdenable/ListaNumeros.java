/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion.ClassOrdenable;
import Interfaces.OrdenableInterfaz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author HP
 */
public class ListaNumeros implements OrdenableInterfaz {
    private final List<Integer> numeros; 
    
    public ListaNumeros() {
        this.numeros = new ArrayList<>();
    }
    
    // Método para agregar números a la lista
    public void agregarNumero(int numero) {
        numeros.add(numero);
    }
    
    // Método para obtener la lista actual
    public List<Integer> getNumeros() {
        return numeros;
    }

    @Override
    public void ordenar() {
        Collections.sort(numeros);
    }
    
    public void mostrarNumeros() {
        System.out.println("Lista de números: " + numeros);
    }
    
}
