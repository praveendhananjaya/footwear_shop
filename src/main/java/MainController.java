import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;

public class MainController {

    public ListView<Image> Navi;

    String name[] = {"parveen","dhanana"} ;
    Image image[] = {new Image("image/footwear.png") , new Image("image/footwear.png") } ;

    @FXML
    public void initialize() {
        System.out.println("kk");
        Navi.getItems().addAll(image);
    }

}
