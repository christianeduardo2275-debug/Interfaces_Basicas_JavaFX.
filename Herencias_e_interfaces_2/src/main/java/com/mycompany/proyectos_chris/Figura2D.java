package com.mycompany.proyectos_chris;

public abstract class Figura2D implements FiguraPlana {
    
    public Figura2D() {
        System.out.println("Se imprime una FiguraPlana...");
    }

    protected abstract String imprimeFigura();
}