import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import security.Rpc;

import java.io.IOException;

public class LoginController extends Rpc {
    public TextField UserId;
    public PasswordField Password;

    public void Login(MouseEvent mouseEvent) {

        String User = UserId.getText();
        String pass = Password.getText() ;

        if(systemLogin(User, pass)){
            System.out.println("login");
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("screen/Main.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            if( root != null ) {
                Scene scene = new Scene(root);
                //  scene.getStylesheets().add(getClass().getResource("theme.css").toExternalForm());
                Stage stage = (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow() ;
                stage.setTitle("Main");
                stage.setScene(scene);
                stage.show();
            }
        }else {
            UserId.clear();
            Password.clear();
            UserId.setPromptText("incorrect user id");
            Password.setPromptText("incorrect password");
        }

    }
}
