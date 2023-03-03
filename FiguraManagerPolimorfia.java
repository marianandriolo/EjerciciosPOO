/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.core.poo;

/**
 *
 * @author Usuario
 */
public class FiguraManagerPolimorfia {
  private Figura[] listaFiguras = new Figura[6];

    public void mostrarContenido(Figura... lista){
        for (Figura element: lista) {
            System.out.println(element.calculateArea());
            if (element instanceof Circulo){
                System.out.println("Soy un circulo");
            } else if (element instanceof Rectangulo) {
                System.out.println("Soy un rectangulo!");
            }
        }
    }

    public void mostrarContenido(){
        for (Figura element: listaFiguras) {
            System.out.println(element.calculateArea());
            if (element instanceof Circulo){
                System.out.println("Soy un circulo");
            } else if (element instanceof Rectangulo) {
                System.out.println("Soy un rectangulo!");
            }
        }
    }
}
