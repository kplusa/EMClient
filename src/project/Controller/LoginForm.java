package project.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import project.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginForm implements Initializable {
double x=0, y=0;
static final int HBoxXMin=432;
static final int HBoxXMax=492;
static final int HBoxYMin=14;
static final int HBoxYMax=44;


    @FXML
    private AnchorPane APMain;

    @FXML
    void closeAction(MouseEvent event) {
    System.exit(0);
    }

    @FXML
    void minAction(MouseEvent event) {
     Main.stage.setIconified(true);
    }

    @FXML
    void MakeDraggable(){
        APMain.setOnMousePressed(event -> {
            x = event.getSceneX();
            y = event.getSceneY();
        });
        APMain.setOnMouseDragged(event -> {
            if(!(x>=HBoxXMin&&x<=HBoxXMax)||!(y>=HBoxYMin&&y<=HBoxYMax)) {
                Main.stage.setX(event.getScreenX() - x);
                Main.stage.setY(event.getScreenY() - y);
            }
        });
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
MakeDraggable();
    }
}
