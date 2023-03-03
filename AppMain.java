
package com.core.poo;

public class AppMain {
  
    public static void main (String[] args){
        
        FiguraManager manager = new FiguraManager();
        FiguraManagerPolimorfia managerPolimorfia = new FiguraManagerPolimorfia ();
        
        Rectangulo figu1 = new Rectangulo(10,3,"lolita","NEGRO");
        Rectangulo figu7 = new Rectangulo(10,3,"lolita","NEGRO");
        Rectangulo figu2 = new Rectangulo(34,3,"kelita","VERDE");
        Rectangulo figu3 = new Rectangulo(4,35,"lelita","MARRON");
        
        Circulo figu4 = new Circulo(34,"potico","AZUL");
        Circulo figu5 = new Circulo(3,"potico 2",Color.VERDE);
        Circulo figu6 = new Circulo(364,"potico 3","MORADO");

        System.out.println(figu1.equals(figu7));
        
//        for(Color col:Color.values()){
//            System.out.println(col);
//        }
//        manager.setCirculos(figu4, figu5, figu6);
//        manager.setRectangulos(figu1,figu2,figu3);
//
//
//        
//        manager.mostrarContenido();
//        manager.mostrarContenido(manager.getCirculos());
//        manager.mostrarContenido(manager.getRectangulos());
    }
}
