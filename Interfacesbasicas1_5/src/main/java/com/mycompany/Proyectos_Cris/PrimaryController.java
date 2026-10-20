package com.mycompany.Proyectos_Cris;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtAlimentacion;
    @FXML private TextField txtRefrigerios;
    @FXML private TextField txtTransporte;
    @FXML private TextField txtTelefonia;
    @FXML private TextField txtOtros;
    @FXML private TextField txtTotal;
    @FXML private TextField txtGastoAlto;

    @FXML
    private void calcularEstadisticas() {
        double alim = parseValor(txtAlimentacion.getText());
        double refr = parseValor(txtRefrigerios.getText());
        double transp = parseValor(txtTransporte.getText());
        double tel = parseValor(txtTelefonia.getText());
        double otros = parseValor(txtOtros.getText());

        GastosSemanales gastos = new GastosSemanales(alim, refr, transp, tel, otros);

        txtTotal.setText(String.format("%.0f", gastos.calcularTotal()));
        txtGastoAlto.setText(gastos.obtenerGastoMasAlto());
    }

    private double parseValor(String text) {
        if (text == null || text.trim().isEmpty()) return 0;
        return Double.parseDouble(text.trim());
    }

    @FXML
    private void limpiar() {
        txtAlimentacion.clear();
        txtRefrigerios.clear();
        txtTransporte.clear();
        txtTelefonia.clear();
        txtOtros.clear();
        txtTotal.clear();
        txtGastoAlto.clear();
    }
}