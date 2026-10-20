package com.mycompany.ProyectosCris;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtNumero;
    @FXML private TextField txtCantidad;
    @FXML private TextField txtSumaImpares;
    @FXML private TextField txtSumaPares;
    @FXML private TextField txtSumaTotal;
    @FXML private TextField txtMayor;
    @FXML private TextField txtMenor;
    @FXML private TextArea txtDivisores;

    @FXML
    private void analizar() {
        if (txtNumero.getText() == null || txtNumero.getText().trim().isEmpty()) {
            return;
        }

        String strNum = txtNumero.getText().trim();
        AnalizadorNumero analizador = new AnalizadorNumero(strNum);

        txtCantidad.setText(String.valueOf(analizador.getCantidadCifras()));
        txtSumaImpares.setText(String.valueOf(analizador.getSumaImpares()));
        txtSumaPares.setText(String.valueOf(analizador.getSumaPares()));
        txtSumaTotal.setText(String.valueOf(analizador.getSumaTotal()));
        txtMayor.setText(String.valueOf(analizador.getCifraMayor()));
        txtMenor.setText(String.valueOf(analizador.getCifraMenor()));
        txtDivisores.setText(analizador.getDivisoresFormateados());
    }

    @FXML
    private void limpiar() {
        txtNumero.clear();
        txtCantidad.clear();
        txtSumaImpares.clear();
        txtSumaPares.clear();
        txtSumaTotal.clear();
        txtMayor.clear();
        txtMenor.clear();
        txtDivisores.clear();
    }
}