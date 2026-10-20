package com.mycompany.ProyectosCris;

public class AnalizadorNumero {

    private String numeroTexto;
    private int numero;

    public AnalizadorNumero(String numeroTexto) {
        this.numeroTexto = numeroTexto;
        this.numero = Integer.parseInt(numeroTexto);
    }

    public int getCantidadCifras() {
        return numeroTexto.length();
    }

    public int getSumaImpares() {
        int suma = 0;
        for (char c : numeroTexto.toCharArray()) {
            int digito = Character.getNumericValue(c);
            if (digito % 2 != 0) {
                suma += digito;
            }
        }
        return suma;
    }

    public int getSumaPares() {
        int suma = 0;
        for (char c : numeroTexto.toCharArray()) {
            int digito = Character.getNumericValue(c);
            if (digito % 2 == 0) {
                suma += digito;
            }
        }
        return suma;
    }

    public int getSumaTotal() {
        int suma = 0;
        for (char c : numeroTexto.toCharArray()) {
            suma += Character.getNumericValue(c);
        }
        return suma;
    }

    public int getCifraMayor() {
        int mayor = Character.getNumericValue(numeroTexto.charAt(0));
        for (char c : numeroTexto.toCharArray()) {
            int digito = Character.getNumericValue(c);
            if (digito > mayor) {
                mayor = digito;
            }
        }
        return mayor;
    }

    public int getCifraMenor() {
        int menor = Character.getNumericValue(numeroTexto.charAt(0));
        for (char c : numeroTexto.toCharArray()) {
            int digito = Character.getNumericValue(c);
            if (digito < menor) {
                menor = digito;
            }
        }
        return menor;
    }

    public String getDivisoresFormateados() {
        StringBuilder divisores = new StringBuilder();
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores.append(i).append("\n");
            }
        }
        return divisores.toString();
    }
}
