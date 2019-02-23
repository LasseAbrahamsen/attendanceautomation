/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceautomation.gui.controller;

import attendanceautomation.gui.model.Errorbox;
import attendanceautomation.gui.model.StudentModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author youPCbr0
 */
public class AddNewStudentController implements Initializable {

    @FXML
    private TextField textfieldName;
    @FXML
    private TextField textfieldAttendance;
    
    private boolean isEditing = false;
    StudentModel smodel = new StudentModel();
    
    private double attendance = 1.0;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void saveStudent(ActionEvent event) {
        String studentName = textfieldName.getText().trim();
        if(studentName.length() == 0 || studentName.length() >= 50 || studentName == null) {
            Errorbox.displayError("The name of the student must not be empty and must be shorter than 50 characters.");
            return;
        }
        attendance = Double.parseDouble(textfieldAttendance.getText());
        if(attendance <= 100.0 && attendance >= 0.0) {
            return;
        } else {
            Errorbox.displayError("Attendance must not be empty");
        }
        if (!isEditing) {
            smodel.createStudent(studentName); 
        } else {
            //smodel.editStudent(studentName);
        }
        close();
    }
    
    @FXML
    private void close(ActionEvent event) {
        close();
    }
    
    private void close() {
        Stage stage = (Stage) textfieldName.getScene().getWindow();
        stage.close();
    }
    
}
