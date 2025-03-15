/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion.ClassFiguraGeometrica;
import Interfaces.FiguraGeometricaInterfaz;
/**
 *
 * @author HP
 */
public class Rectangulo implements FiguraGeometricaInterfaz {
    private final double base;
    private final double altura;
    
    public Rectangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;    
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);       
    }
    
    
    
}
