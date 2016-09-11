package kz.kaznitu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Created by daulet on 9/11/16.
 */
public class Controller {
    @FXML
    Button btn1 ;

    public void test(ActionEvent actionEvent) {
        btn1.setText("Test Button");
    }
}
