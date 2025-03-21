
package Implementacion.ClassAlimentacion;
import Interfaces.AlimentacionInterfaz;

public class Persona implements AlimentacionInterfaz {
    private final String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo sentado a la mesa.");
        System.out.println("Utiliza cubiertos para comer de forma civilizada.");
        System.out.println("Come tres veces al día: desayuno, almuerzo y cena.");
    }
    
        public void cocinar() {
        System.out.println(nombre + " está preparando comida en la cocina.");
    }
}
