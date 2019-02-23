package attendanceautomation.gui.model;

import attendanceautomation.be.Attendance;
import attendanceautomation.be.Student;
import attendanceautomation.be.Weekday;
import attendanceautomation.bll.PassToModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class StudentModel {
    
    PassToModel pass = new PassToModel();
    private ObservableList<Student> students = FXCollections.observableArrayList();
    private ObservableList<Student> studentInfos = FXCollections.observableArrayList();
    
    public ObservableList<Student> getAllStudents() {
        if (pass.getAllStudents() != null) {
        students.clear();
        students.addAll(pass.getAllStudents());
        return students;
        } else {
            return null;
        }
    }
    
    public ObservableList<Student> getStudentInfo() {
        if (pass.getAllStudents() != null) {
        studentInfos.clear();
        studentInfos.addAll(); //implement this
        return studentInfos;
        } else {
            return null;
        }
    }
    
    public void createStudent(String name) {
        pass.createStudent(name);
    }
    
    public Student getStudent(String name) {
        return pass.getStudent(name);
    }
    
    public void removeStudent(Student e) {
        pass.removeStudent(e);
    }
}
