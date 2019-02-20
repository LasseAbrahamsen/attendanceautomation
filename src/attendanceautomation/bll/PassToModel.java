package attendanceautomation.bll;

import attendanceautomation.be.Student;
import attendanceautomation.dal.MockData;
import java.util.ArrayList;

public class PassToModel {
    
    MockData mock = new MockData();
    
    public ArrayList<Student> getAllStudents() {
        return mock.getAllStudents();
    }
    
    public void createStudent(String name, double attendance) {
        mock.createStudent(name, attendance);
    }
    
    public Student editStudent(String name, double attendance) {
        return mock.editStudent(name, attendance);
    }
    
    public void removeStudent(Student e) {
        mock.removeStudent(e);
    }
}
