package com.mycompany.ejercicio1_1;

import java.time.LocalDate;
import java.time.Period;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtFecha;
    @FXML private Label lblResultado;

    @FXML
    private void calcularEdad() {
        String[] partes = txtFecha.getText().split("/");
        int diaNac = Integer.parseInt(partes[0]);
        int mesNac = Integer.parseInt(partes[1]);
        int anioNac = Integer.parseInt(partes[2]);

        LocalDate hoy = LocalDate.now();
        LocalDate nacimiento = LocalDate.of(anioNac, mesNac, diaNac);
        Period periodo = Period.between(nacimiento, hoy);

        lblResultado.setText("Tiene " + periodo.getYears() + " años con " + periodo.getMonths() + " meses");
    }

    @FXML
    private void limpiar() {
        txtFecha.clear();
        lblResultado.setText("");
    }
}