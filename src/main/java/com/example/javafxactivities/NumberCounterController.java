package com.example.javafxactivities;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class NumberCounterController {
    @FXML
    private Label countLabel;
    private int n;

    public NumberCounterController() {
        n = 0;
    }

    @FXML
    protected void onDecrease() {
        n--;
        countLabel.setText(n + "");
        return;
    }

    @FXML
    protected void onIncrease() {
        n++;
        countLabel.setText(n + "");
        return;
    }
}
