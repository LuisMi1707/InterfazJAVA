
package Implementacion.ClassDescontable;

import Interfaces.DescontableInterfaz;


public class DescuentoFijo implements DescontableInterfaz {
    private double cantidadFija;
    
     public DescuentoFijo(double cantidadFija) {
        this.cantidadFija = cantidadFija;
    }

    @Override
    public double calcularDescuento(double precio) {
        // El descuento no puede ser mayor que el precio
        return Math.min(cantidadFija, precio);
    }
    
}
