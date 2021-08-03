import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import security.Rpc ;
import java.util.ArrayList ;


public class NaviController {

    public ImageView image1;
    public ImageView image2;
    public ImageView image3;
    public ImageView image4;
    public ImageView image5;
    public AnchorPane MainWindow;

    private ArrayList<ImageView> imageView = new ArrayList<ImageView>() ;

    @FXML
    public void initialize() {
        imageView.add( image1) ;
        imageView.add( image2) ;
        imageView.add( image3) ;
        imageView.add( image4) ;
        imageView.add( image5) ;


        String userLevel[] = Rpc.userAllowed(); // navigation bar

        List naviList[] = new List[userLevel.length];
        for( int i  = 0 ; i < userLevel.length ; i++  ){
           naviList[i] = new List(userLevel[i]) ;
            imageView.get(i).setImage(naviList[i].getImage());

        }

    }

    public void listButton1(MouseEvent mouseEvent) {

    }

    public void listButton2(MouseEvent mouseEvent) {
    }

    public void listButton3(MouseEvent mouseEvent) {
    }

    public void listButton4(MouseEvent mouseEvent) {
    }

    public void listButton5(MouseEvent mouseEvent) {
    }
}


class List{

    private String name = "" ;
    private String photo = "/image/home.png" ;
    private String xml = "" ;

    List(String name){
        this.name = name ;
        switch (name){
            case "billing":
                photo = "/image/billing.png" ;
                xml = "screen/billing.fxml" ;
                break;
            case ("test"):
                photo = "" ;
                break;
            default:
                System.out.println(name);
                photo = "/image/home.png" ;
        }

    }

    public Image getImage() {
        Image image = new Image(this.photo);
        return image;
    }
}

