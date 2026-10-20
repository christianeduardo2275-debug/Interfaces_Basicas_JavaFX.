package com.mycompany.proyectos_chris;

import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    public void initialize() {
        ejecutarTest();
    }

    private void ejecutarTest() {
        Figura2D f = new TrianguloRect(3, 4);
        System.out.println(f.imprimeFigura());
        
        f = new Circulo(3);
        System.out.println(f.imprimeFigura());
    }
}