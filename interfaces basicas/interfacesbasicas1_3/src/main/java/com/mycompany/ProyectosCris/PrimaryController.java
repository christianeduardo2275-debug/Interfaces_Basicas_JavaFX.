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
        int num = Integer.parseInt(strNum);

        txtCantidad.setText(String.valueOf(strNum.length()));

        int sumaImpares = 0;
        int sumaPares = 0;
        int sumaTotal = 0;
        int mayor = Character.getNumericValue(strNum.charAt(0));
        int menor = mayor;

        for (int i = 0; i < strNum.length(); i++) {
            int digito = Character.getNumericValue(strNum.charAt(i));
            sumaTotal += digito;

            if (digito % 2 == 0) {
                sumaPares += digito;
            } else {
                sumaImpares += digito;
            }

            if (digito > mayor) mayor = digito;
            if (digito < menor) menor = digito;
        }

        txtSumaImpares.setText(String.valueOf(sumaImpares));
        txtSumaPares.setText(String.valueOf(sumaPares));
        txtSumaTotal.setText(String.valueOf(sumaTotal));
        txtMayor.setText(String.valueOf(mayor));
        txtMenor.setText(String.valueOf(menor));

        StringBuilder divisores = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisores.append(i).append("\n");
            }
        }
        txtDivisores.setText(divisores.toString());
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