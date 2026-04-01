package com.example.javafxactivities;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class FoodOrderingSystem {

    @FXML private Label subtotalLabel;
    @FXML private Label discountLabel;
    @FXML private Label fPriceLabel;
    @FXML private RadioButton rbNone;
    @FXML private RadioButton rb5;
    @FXML private RadioButton rb10;
    @FXML private RadioButton rb15;
    @FXML private CheckBox cPizza;
    @FXML private CheckBox cBurger;
    @FXML private CheckBox cSoftdrinks;
    @FXML private CheckBox cFries;
    @FXML private CheckBox cTea;
    @FXML private CheckBox cSundae;

    private double sum;
    private double discountPercent;

    public FoodOrderingSystem() {}

    @FXML
    public void initialize() {
        subtotalLabel.setText("Subtotal: ");
        discountLabel.setText("Discount: ");
        sum = 0;
        discountPercent = 0;
    }

    @FXML
    protected void cPizzaOnClicked() {
        if(cPizza.isSelected()) sum += 100;
        else sum -= 100;
    }

    @FXML
    protected void cBurgerOnClicked() {
        if(cBurger.isSelected()) sum += 80;
        else sum -= 80;
    }

    @FXML
    protected void cFriesOnClicked() {
        if(cFries.isSelected()) sum += 65;
        else sum -= 65;
    }

    @FXML
    protected void cSoftdrinksOnClicked() {
        if(cSoftdrinks.isSelected()) sum += 55;
        else sum -= 55;
    }

    @FXML
    protected void cTeaOnClicked() {
        if(cTea.isSelected()) sum += 50;
        else sum -= 50;
    }

    @FXML
    protected void cSundaeOnClicked() {
        if(cSundae.isSelected()) sum += 40;
        else sum -= 40;
    }

    @FXML
    protected void noneOnClicked() {
        if(rbNone.isSelected()) {
            discountPercent = 0;
        }
    }

    @FXML
    protected void rb15OnClicked() {
        if(rb15.isSelected()) {
            discountPercent = 0.15;
        } else {
            discountPercent = 0;
        }
    }

    @FXML
    protected void rb10OnClicked() {
        if(rb10.isSelected()) {
            discountPercent = 0.10;
        } else {
            discountPercent = 0;
        }
    }

    @FXML
    protected void rb5OnClicked() {
        if(rb5.isSelected()) {
            discountPercent = 0.05;
        } else {
            discountPercent = 0;
        }
    }

    @FXML
    protected void clearOnClicked() {
        sum = 0;
        discountPercent = 0;
        subtotalLabel.setText("Subtotal: ");
        discountLabel.setText("Discount: ");
        fPriceLabel.setText("");
        cPizza.setSelected(false);
        cBurger.setSelected(false);
        cFries.setSelected(false);
        cTea.setSelected(false);
        cSoftdrinks.setSelected(false);
        cSundae.setSelected(false);
        rb5.setSelected(false);
        rb15.setSelected(false);
        rb10.setSelected(false);
        rbNone.setSelected(true);
    }

    @FXML
    protected void calculateOrder() {
        double deduct = sum * discountPercent;
        double finalPrice = sum - deduct;
        subtotalLabel.setText("Subtotal: " + String.format("%.2f", sum));
        discountLabel.setText("Discount: -" + String.format("%.2f", deduct));
        fPriceLabel.setText("The total price is PHP" + String.format("%.2f", finalPrice));
        return;
    }

}
