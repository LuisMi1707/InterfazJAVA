
package Implementacion.ClassDescontable;
import Interfaces.DescontableInterfaz;

public class DescuentoPorcentaje implements DescontableInterfaz {
    private double porcentaje;
    
    // Constructor
    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularDescuento(double precio) {
        return precio * (porcentaje / 100);

    }
    
}
