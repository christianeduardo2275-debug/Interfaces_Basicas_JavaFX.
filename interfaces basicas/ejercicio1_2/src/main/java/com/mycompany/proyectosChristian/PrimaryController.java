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

        int c500 = monto / 500; monto %= 500;
        int c200 = monto / 200; monto %= 200;
        int c100 = monto / 100; monto %= 100;
        int c50  = monto / 50;  monto %= 50;
        int c20  = monto / 20;  monto %= 20;
        int c10  = monto / 10;  monto %= 10;
        int c5   = monto / 5;   monto %= 5;
        int c2   = monto / 2;   monto %= 2;
        int c1   = monto;

        lbl500.setText(String.valueOf(c500));
        lbl200.setText(String.valueOf(c200));
        lbl100.setText(String.valueOf(c100));
        lbl50.setText(String.valueOf(c50));
        lbl20.setText(String.valueOf(c20));
        lbl10.setText(String.valueOf(c10));
        lbl5.setText(String.valueOf(c5));
        lbl2.setText(String.valueOf(c2));
        lbl1.setText(String.valueOf(c1));
    }

    @FXML
    private void borrarEntrada() {
        txtDinero.clear();
    }
}