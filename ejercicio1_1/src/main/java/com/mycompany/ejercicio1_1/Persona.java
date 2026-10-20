package com.mycompany.ejercicio1_1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private LocalDate fechaNacimiento;

    public Persona(String fechaTexto) {
        String[] partes = fechaTexto.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int anio = Integer.parseInt(partes[2]);
        this.fechaNacimiento = LocalDate.of(anio, mes, dia);
    }

    public String obtenerEdad() {
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(this.fechaNacimiento, hoy);
        return "Tiene " + periodo.getYears() + " años con " + periodo.getMonths() + " meses";
    }
}