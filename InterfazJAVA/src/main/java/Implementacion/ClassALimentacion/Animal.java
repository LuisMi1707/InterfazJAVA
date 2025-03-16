
package Implementacion.ClassAlimentacion;
import Interfaces.AlimentacionInterfaz;

public class Animal implements AlimentacionInterfaz {
    private final String especie;
    
    public Animal(String especie) {
        this.especie = especie;

    }

    @Override
    public void comer() {
         System.out.println("El " + especie + " está comiendo según su instinto.");
        System.out.println("Busca su alimento en la naturaleza.");
        System.out.println("Come cuando tiene hambre, siguiendo su comportamiento instintivo.");
    }
    
    public void cazar() {
        System.out.println("El " + especie + " está cazando para alimentarse.");
    }
    
}
