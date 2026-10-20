package com.mycompany.proyectos_chris;

public class Profesor extends Persona {
    private int numEmpleado;

    public Profesor(int numEmpleado) {
        super();
        this.numEmpleado = numEmpleado;
    }

    @Override
    public String toString() {
        return "Erick Huerta Valdepeña, con edad " + this.edad + ", con clave " + this.numEmpleado;
    }
}
       