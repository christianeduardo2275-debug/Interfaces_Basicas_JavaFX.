package com.mycompany.proyectosChristian;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtDinero;

    @FXML private Label lbl500, lbl200, lbl100, lbl50, lbl20;
    @FXML private Label lbl10, lbl5, lbl2, lbl1;

    @FXML
    private void desglosar() {
        if (txtDinero.getText() == null || txtDinero.getText().trim().isEmpty()) {
            return;
        }

        int monto = Integer.parseInt(txtDinero.getText().trim());
        
        CalculadoraDesglose calculadora = new CalculadoraDesglose(monto);
        int[] resultado = calculadora.calcularDenominaciones();

        lbl500.setText(String.valueOf(resultado[0]));
        lbl200.setText(String.valueOf(resultado[1]));
        lbl100.setText(String.valueOf(resultado[2]));
        lbl50.setText(String.valueOf(resultado[3]));
        lbl20.setText(String.valueOf(resultado[4]));
        lbl10.setText(String.valueOf(resultado[5]));
        lbl5.setText(String.valueOf(resultado[6]));
        lbl2.setText(String.valueOf(resultado[7]));
        lbl1.setText(String.valueOf(resultado[8]));
    }

    @FXML
    private void borrarEntrada() {
        txtDinero.clear();
    }
}