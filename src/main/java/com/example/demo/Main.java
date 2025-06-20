package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlUrl = getClass().getResource("main.fxml");
        Parent root = FXMLLoader.load(fxmlUrl);

        primaryStage.setTitle("Строительная компания");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }
}
