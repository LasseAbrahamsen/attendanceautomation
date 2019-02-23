package attendanceautomation.bll;

import attendanceautomation.be.Student;
import attendanceautomation.dal.MockData;
import java.util.ArrayList;

public class PassToModel {
    
    MockData mock = new MockData();
    
    public ArrayList<Student> getAllStudents() {
        return mock.getAllStudents();
    }
    
    public void createStudent(String name) {
        mock.createStudent(name);
    }
    
    public Student getStudent(String name) {
        return mock.getStudent(name);
    }
    
    public void removeStudent(Student e) {
        mock.removeStudent(e);
    }
}
