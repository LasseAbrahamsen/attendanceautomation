package attendanceautomation.gui.controller;

import attendanceautomation.be.Attendance;
import attendanceautomation.be.Weekday;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

public class MoreInfoController implements Initializable {

    @FXML
    private TableColumn<Weekday, String> colDay;
    @FXML
    private TableColumn<Attendance, Double> colAttendance;
    @FXML
    private Label labelName;
    @FXML
    private Label labelTA;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
