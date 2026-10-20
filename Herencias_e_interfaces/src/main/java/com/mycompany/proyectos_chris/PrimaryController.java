package com.mycompany.proyectos_chris;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class PrimaryController {

    @FXML private TextArea txtConsole;

    @FXML
    public void initialize() {
        ejecutarTest();
    }

    @FXML
    private void ejecutarTest() {
        StringBuilder sb = new StringBuilder();

        sb.append("Se crea Alumno...\n");
        Alumno a = new Alumno();
        Profesor p = new Profesor(2024891604);

        sb.append(a.toString()).append("\n");
        sb.append(p.toString()).append("\n");

        System.out.println(a);
        System.out.println(p);

        if (txtConsole != null) {
            txtConsole.setText(sb.toString());
        }
    }
}