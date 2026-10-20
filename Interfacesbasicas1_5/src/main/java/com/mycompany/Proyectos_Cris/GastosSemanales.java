package com.mycompany.Proyectos_Cris;

public class GastosSemanales {

    private double alimentacion;
    private double refrigerios;
    private double transporte;
    private double telefonia;
    private double otros;

    public GastosSemanales(double alimentacion, double refrigerios, double transporte, double telefonia, double otros) {
        this.alimentacion = alimentacion;
        this.refrigerios = refrigerios;
        this.transporte = transporte;
        this.telefonia = telefonia;
        this.otros = otros;
    }

    public double calcularTotal() {
        return alimentacion + refrigerios + transporte + telefonia + otros;
    }

    public String obtenerGastoMasAlto() {
        double[] valores = {alimentacion, refrigerios, transporte, telefonia, otros};
        String[] nombres = {"Alimentación", "Refrigerios", "Transporte", "Telefonía", "Otros"};

        int maxIdx = 0;
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > valores[maxIdx]) {
                maxIdx = i;
            }
        }

        return nombres[maxIdx];
    }
}