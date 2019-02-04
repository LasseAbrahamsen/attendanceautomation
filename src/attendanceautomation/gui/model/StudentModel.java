package attendanceautomation.gui.model;

import attendanceautomation.be.Student;
import attendanceautomation.bll.PassToModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class StudentModel {
    
    PassToModel pass = new PassToModel();
    private ObservableList<Student> students = FXCollections.observableArrayList();
    
    public ObservableList<Student> getAllStudents() {
        if (pass.getAllStudents() != null) {
        students.clear();
        students.addAll(pass.getAllStudents());
        return students;
        } else {
            return null;
        }
    }
    
    public void createStudent(String name, double attendance, int id) {
        pass.createStudent(name, attendance, id);
    }
    
    public Student editStudent(String name, double attendance, int id) {
        return pass.editStudent(name, attendance, id);
    }
    
    public void removeStudent(Student e) {
        pass.removeStudent(e);
    }
}
