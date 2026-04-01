package com.example.javafxactivities;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FoodOrderApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FoodOrderApplication.class.getResource("food-order-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Food Ordering System");
        stage.setScene(scene);
        stage.show();
    }
}
