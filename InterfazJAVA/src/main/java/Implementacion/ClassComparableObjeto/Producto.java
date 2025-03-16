
package Implementacion.ClassComparableObjeto;
import Interfaces.ComparableObjetoInterfaz;

public class Producto implements ComparableObjetoInterfaz {
    private String nombre;
    private double precio;
    
    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }

    @Override
    public int comparar(Object o) {
        // Convertir el objeto a Producto
        Producto otroProducto = (Producto) o;
        
        // Comparar por precio
        if (this.precio < otroProducto.precio) {
            return -1; // Este producto es más barato
        } else if (this.precio > otroProducto.precio) {
            return 1;  // Este producto es más caro
        } else {
            return 0;  // Ambos productos tienen el mismo precio
        }
        
    }
    @Override
    public String toString() {
        return nombre + " ($" + precio + ")";
    }
       
}
