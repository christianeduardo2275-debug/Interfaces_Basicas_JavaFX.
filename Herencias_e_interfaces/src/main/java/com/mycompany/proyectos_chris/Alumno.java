package com.mycompany.proyectos_chris;

public class Alumno extends Persona {

    public Alumno() {
        super();
        System.out.println("Se crea Alumno...");
    }

    @Override
    public String toString() {
        return "Un alumno llamado: " + this.nombre;
    }
}