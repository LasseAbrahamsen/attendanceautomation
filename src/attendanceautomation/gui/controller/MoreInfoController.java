package attendanceautomation.gui.controller;

import attendanceautomation.be.Attendance;
import attendanceautomation.be.Student;
import attendanceautomation.be.Weekday;
import attendanceautomation.gui.model.StudentModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class MoreInfoController implements Initializable {

    @FXML
    private TableColumn<Weekday, String> colDay;
    @FXML
    private TableColumn<Attendance, Double> colAttendance;
    @FXML
    private Label labelName;
    @FXML
    private Label labelTA;
    @FXML 
    private TableView<Student> tableviewInfo;
    
    StudentModel smodel = new StudentModel();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        reload();
    } 
    
    public void reload() {
        if(smodel.getAllStudents() != null) {
            tableviewInfo.setItems(smodel.getStudentInfo());
        }
    }

    public void setAllInfo(Student selectedStudent) {
        labelName.setText(selectedStudent.getName());
        labelTA.setText(String.valueOf(selectedStudent.getAttendanceRatio(2019)));
        reload();
    }
    
    @FXML
    private void close(ActionEvent event) {
        close();
    }
    
    private void close() {
        Stage stage = (Stage) labelName.getScene().getWindow();
        stage.close();
    }
    
}
