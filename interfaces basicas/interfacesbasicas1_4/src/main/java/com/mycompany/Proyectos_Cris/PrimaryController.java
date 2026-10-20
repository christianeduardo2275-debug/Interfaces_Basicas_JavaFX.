package com.mycompany.Proyectos_Cris;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtNumero;
    @FXML private TextArea txtResultado;

    @FXML
    private void calcular() {
        if (txtNumero.getText() == null || txtNumero.getText().trim().isEmpty()) {
            return;
        }

        int num = Integer.parseInt(txtNumero.getText().trim());
        StringBuilder tabla = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            tabla.append(num).append("x").append(i).append(" = ").append(num * i).append("\n");
        }

        txtResultado.setText(tabla.toString());
    }

    @FXML
    private void limpiar() {
        txtNumero.clear();
        txtResultado.clear();
    }
}