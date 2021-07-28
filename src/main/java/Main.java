

/**
 *
 */


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        Parent root = FXMLLoader.load(getClass().getResource("screen/login.fxml"));

        Scene scene = new Scene(root);
      //  scene.getStylesheets().add(getClass().getResource("theme.css").toExternalForm());
        Image imageIcon = new Image("image/footwear.png");
        primaryStage.setTitle("Login");
        primaryStage.getIcons().add(imageIcon);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
