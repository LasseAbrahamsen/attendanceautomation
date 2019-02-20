package attendanceautomation.gui.controller;

import attendanceautomation.be.Attendance;
import attendanceautomation.be.Student;
import attendanceautomation.gui.model.StudentModel;
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
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class OverviewController implements Initializable {

    @FXML
    private TableColumn<Student, String> colName;
    @FXML 
    private TableColumn<Attendance, Double> colAttendance;
    @FXML
    private TableView<Student> tableViewOverview;
    
    StudentModel sModel = new StudentModel();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        colName.setCellValueFactory(new PropertyValueFactory("name"));
        colAttendance.setCellValueFactory(new PropertyValueFactory("attendance"));
        reload();
    }    
    
    public void reload() {
        if(sModel.getAllStudents() != null) {
            tableViewOverview.setItems(sModel.getAllStudents());
        }
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
    
    @FXML
    private void addStudent(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/attendanceautomation/gui/view/addNewStudent.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) new Stage();
        stage.setScene(scene);
        stage.setTitle("Adding new student");
        stage.show();
    }
    
}
