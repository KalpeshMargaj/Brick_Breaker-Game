package com.example.temp;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
public class HelloApplication extends Application {
    static Stage globalstage;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dummy_start_page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        globalstage=stage;
        stage.setTitle("Welcome to the game!");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void onstartbuttonclick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("screen_page.fxml"));
        Scene scene = new Scene(fxmlLoader. load(), 600, 400);

        globalstage.setScene(scene);
        globalstage.setTitle("Hit the bricks >>>");
        globalstage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}