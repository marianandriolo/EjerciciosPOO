
package com.core.poo;


public class Circulo extends Figura{
    double radio, diametro;
   
    public Circulo(double radio, String nombre, String color) {
        super(nombre, color);
        this.radio = radio;
        this.diametro = radio*2;
        calculateArea();
    }   
    public Circulo(double radio, String nombre, Color color) {
        super(nombre, color);
        this.radio = radio;
        this.diametro = radio*2;
        calculateArea();
    }   
    public Circulo() {
        super();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    @Override
    public double calculateArea() {
       double x=Math.PI*(Math.pow(radio,2));
       super.setArea(x);
       return x;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "radio: " + radio + ", diametro: " + diametro ;
    }


    
}
