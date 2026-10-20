package com.mycompany.proyectosChristian;

public class CalculadoraDesglose {

    private int monto;

    public CalculadoraDesglose(int monto) {
        this.monto = monto;
    }

    public int[] calcularDenominaciones() {
        int temp = this.monto;
        
        int b500 = temp / 500; temp %= 500;
        int b200 = temp / 200; temp %= 200;
        int b100 = temp / 100; temp %= 100;
        int b50  = temp / 50;  temp %= 50;
        int b20  = temp / 20;  temp %= 20;
        int m10  = temp / 10;  temp %= 10;
        int m5   = temp / 5;   temp %= 5;
        int m2   = temp / 2;   temp %= 2;
        int m1   = temp;

        return new int[]{b500, b200, b100, b50, b20, m10, m5, m2, m1};
    }
}