package attendanceautomation.gui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AttendanceController implements Initializable {
    
    private Label label;
    @FXML
    private VBox hest;
    @FXML
    private Button button;
    @FXML
    private VBox ged;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    @FXML
    private void seeOverview(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/attendanceautomation/gui/view/Overview.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) new Stage();
        stage.setScene(scene);
        stage.setTitle("Overview of all students");
        stage.show();
    }
    
    @FXML
    private void moreInfo(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/attendanceautomation/gui/view/MoreInfo.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) new Stage();
        stage.setScene(scene);
        stage.setTitle("More info on student");
        stage.show();
    }
    
}
