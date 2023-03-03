package com.core.poo;

public enum Color {
    ROJO("#C70039"),
    AZUL("#96DDEB"),
    VERDE("#A4EBAB"),
    MORADO("#891ED3"),
    NEGRO("#000000"),
    MARRON("#BD732E");

    String hexColor;

    Color(String hexColor) {
        this.hexColor = hexColor;
    }
    
}
