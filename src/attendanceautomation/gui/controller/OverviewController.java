package attendanceautomation.gui.controller;

import attendanceautomation.be.Attendance;
import attendanceautomation.be.Student;
import attendanceautomation.gui.model.Errorbox;
import attendanceautomation.gui.model.StudentModel;
import java.io.IOException;
import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class OverviewController implements Initializable {

    @FXML
    private TableColumn<Student, String> colName;
    @FXML 
    private TableColumn<Student, Double> colAttendance;
    @FXML
    private TableView<Student> tableViewOverview;
    
    StudentModel smodel = new StudentModel();
    @FXML private Label labelOverview;

    public void setStudentModel(StudentModel model) {
        smodel = model;
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        colName.setCellValueFactory(new PropertyValueFactory("name"));
        colAttendance.setCellValueFactory(s -> new SimpleDoubleProperty(s.getValue().getAttendanceRatio(2019)).asObject());
        reload();
    }    
    
    public void reload() {
        if(smodel.getAllStudents() != null) {
            tableViewOverview.setItems(smodel.getAllStudents());
        }
    }
    
    @FXML
    private void moreInfo(ActionEvent event) throws IOException {
        Student selectedStudent = tableViewOverview.getSelectionModel().getSelectedItem();
        if (selectedStudent == null) {
            Errorbox.displayError("You must select a student to see information");
        } else {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/attendanceautomation/gui/view/MoreInfo.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            MoreInfoController controller = fxmlLoader.getController();
            controller.setAllInfo(selectedStudent);
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("More info on student");
            stage.showAndWait();

            reload();
        }
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
    
    @FXML
    private void close(ActionEvent event) {
        close();
    }
    
    private void close() {
        Stage stage = (Stage) labelOverview.getScene().getWindow();
        stage.close();
    }
    
    
}
