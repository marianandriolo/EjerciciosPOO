package com.core.poo;

import java.util.Objects;

public abstract class Figura {

    private String nombre;
    private Color color;
    private double area, perimetro;

    public Figura() {
        super();
    }

    public Figura(String nombre, Color color) {
        this.nombre = nombre;
        this.color = color;
    }

    public Figura(String nombre, String color) {
        this(nombre, Color.valueOf(color));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
//    System.out.println(this.getClass().getSimpleName() + " " + nombre);
        this.area = area;
    }

    public abstract double calculateArea();

    protected void calcularPerimetro() {
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + ", color: " + color + ", area: " + area + ", perimetro: " + perimetro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.area) ^ (Double.doubleToLongBits(this.area) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Figura other = (Figura) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return this.color == other.color;
    }

    
    
    
    

}
