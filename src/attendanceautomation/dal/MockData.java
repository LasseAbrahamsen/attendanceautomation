package attendanceautomation.dal;

import attendanceautomation.be.Student;
import java.util.ArrayList;

public class MockData {
    
    private ArrayList<Student> students;
    
    public ArrayList<Student> getAllStudents() {
        return students;
    }
    
    public void createStudent(String name, double attendance, int id) {
        Student e = new Student(name, attendance, getLastId());
        students.add(e);
    }
    
    public int getLastId() {
        return Integer.parseInt((students.get(students.size() + 1)).toString());
    }
    
    public Student editStudent(String name, double attendance, int id) {
        Student e = new Student(name, attendance, id);
        return e;
    }
    
    public void removeStudent(Student e) {
        students.remove(e);
    }
    
    
}
