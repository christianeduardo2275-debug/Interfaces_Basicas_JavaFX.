package com.mycompany.proyectos_chris;

public class TrianguloRect extends FiguraRecta {

    public TrianguloRect(int alto, int ancho) {
        super(alto, ancho);
    }

    @Override
    public double calcularArea() {
        return (ancho * alto) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt(Math.pow(ancho, 2) + Math.pow(alto, 2));
        return ancho + alto + hipotenusa;
    }

    @Override
    public String imprimeFigura() {
        return String.format("Se imprime un Triangulo con alto: %d, ancho: %d, area: %.2f, perimetro: %.2f",
                alto, ancho, calcularArea(), calcularPerimetro());
    }
}