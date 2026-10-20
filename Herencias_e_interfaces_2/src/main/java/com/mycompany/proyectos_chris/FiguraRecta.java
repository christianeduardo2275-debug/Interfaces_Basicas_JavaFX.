package com.mycompany.proyectos_chris;

public abstract class FiguraRecta extends Figura2D {
    protected int ancho;
    protected int alto;

    public FiguraRecta(int alto, int ancho) {
        super();
        this.alto = alto;
        this.ancho = ancho;
    }
}