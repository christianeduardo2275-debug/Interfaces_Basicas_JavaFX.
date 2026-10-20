package com.mycompany.Proyectos_Cris;

public class TablaMultiplicar {

    private int numero;

    public TablaMultiplicar(int numero) {
        this.numero = numero;
    }

    public String generarTabla() {
        StringBuilder tabla = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            tabla.append(numero).append("x").append(i).append(" = ").append(numero * i).append("\n");
        }
        return tabla.toString();
    }
}