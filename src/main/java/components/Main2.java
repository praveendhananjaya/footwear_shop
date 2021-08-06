package components;

/**
 *
 *
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main2 extends Application {

    public static void main(String[] args) {
        launch(args);
        System.out.println("kml");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        Parent root = FXMLLoader.load(getClass().getResource("searchBar.fxml"));

        Scene scene = new Scene(root);
        //  scene.getStylesheets().add(getClass().getResource("theme.css").toExternalForm());
        Image imageIcon = new Image("image/footwear.png");
        primaryStage.setTitle("Login");
        primaryStage.getIcons().add(imageIcon);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
