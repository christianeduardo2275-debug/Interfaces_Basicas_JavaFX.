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
        TablaMultiplicar tablaMultiplicar = new TablaMultiplicar(num);

        txtResultado.setText(tablaMultiplicar.generarTabla());
    }

    @FXML
    private void limpiar() {
        txtNumero.clear();
        txtResultado.clear();
    }
}