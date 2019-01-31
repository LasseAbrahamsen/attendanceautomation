package attendanceautomation.gui.controller;

import attendanceautomation.be.Attendance;
import attendanceautomation.be.Student;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

public class OverviewController implements Initializable {

    @FXML
    private TableColumn<Student, String> colName;
    @FXML 
    private TableColumn<Attendance, Double> colAttendance;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
