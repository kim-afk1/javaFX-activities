package com.example.javafxactivities;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Objects;

public class CalculatorController {
    @FXML private ComboBox<String> cbOperations;
    @FXML private TextField tfNumber1;
    @FXML private TextField tfNumber2;
    @FXML private Label lblResult;
    private int a;
    private int b;


    @FXML
    public void initialize() {
        cbOperations.getItems().addAll("+", "-", "*", "/");
        cbOperations.setValue("+");
        a = b = 0;
    }

    @FXML
    public void onComputeClicked() {
        if(!tfNumber1.getText().isEmpty() && !tfNumber2.getText().isEmpty()) {
            a = Integer.parseInt(tfNumber1.getText());
            b = Integer.parseInt(tfNumber2.getText());
        }

        if(Objects.equals(cbOperations.getValue(), "+")) {
            lblResult.setText(a+b + "");
        } else if(Objects.equals(cbOperations.getValue(), "-")) {
            lblResult.setText(a-b + "");
        } else if(Objects.equals(cbOperations.getValue(), "*")) {
            lblResult.setText(a*b + "");
        } else if(Objects.equals(cbOperations.getValue(), "/")) {
            if(Integer.parseInt(tfNumber1.getText())==0) {
                lblResult.setText("Cannot divide by 0");
                return;
            }
            lblResult.setText(a/b + "");
        }
        return;
    }
}
