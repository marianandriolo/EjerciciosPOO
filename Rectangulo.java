
package com.core.poo;

public class Rectangulo extends Figura{

    private double altura, anchura;

    public Rectangulo(double altura, double anchura, String nombre, String color) {
        super(nombre, color);
        this.altura = altura;
        this.anchura = anchura;
        calculateArea();

    }
    public Rectangulo() {
        this(0.0,0.0,"lolita","transparente");
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }


    @Override
    public double calculateArea() {
        double x = altura*anchura;
        super.setArea(x); 
        return x;
    }

    @Override
    public void calcularPerimetro() {

    }
    
      @Override
    public String toString() {
        return super.toString();
    }
    
}
