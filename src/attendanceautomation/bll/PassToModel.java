package attendanceautomation.bll;

import attendanceautomation.be.Student;
import attendanceautomation.dal.MockData;
import java.util.ArrayList;

public class PassToModel {
    
    MockData mock = new MockData();
    
    public ArrayList<Student> getAllStudents() {
        return mock.getAllStudents();
    }
    
    public void createStudent(String name, double attendance, int id) {
        mock.createStudent(name, attendance, id);
    }
    
    public Student editStudent(String name, double attendance, int id) {
        return mock.editStudent(name, attendance, id);
    }
    
    public void removeStudent(Student e) {
        mock.removeStudent(e);
    }
}
