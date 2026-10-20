package com.mycompany.ejercicio1_1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtFecha;
    @FXML private Label lblResultado;

    @FXML
    private void calcularEdad() {
        Persona persona = new Persona(txtFecha.getText());
        lblResultado.setText(persona.obtenerEdad());
    }

    @FXML
    private void limpiar() {
        txtFecha.clear();
        lblResultado.setText("");
    }
}