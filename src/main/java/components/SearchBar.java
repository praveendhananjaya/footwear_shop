package components;

import impl.org.controlsfx.skin.AutoCompletePopup;
import javafx.scene.control.TextField;
import org.controlsfx.control.textfield.TextFields;
import org.controlsfx.control.textfield.AutoCompletionBinding ;

public class SearchBar {


    public TextField Search;
    private AutoCompletionBinding<String> auto ;
    public void initialize(){
      // TextFields.b
        String[] test = {"hi","hhh","jkrvi","abc"};
        TextFields.bindAutoCompletion(Search,"hi","jkrvi","abc");
        auto =  TextFields.bindAutoCompletion(Search,test);

      //  auto =
        /*
        AutoCompletePopup<String> auto = new AutoCompletePopup();
        auto.getSuggestions().addAll("pao","feijao");
        auto.setStyle("-fx-control-inner-background:black;");
        auto.show(Search);
        */


    }

}
