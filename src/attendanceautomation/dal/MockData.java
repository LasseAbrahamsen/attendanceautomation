package attendanceautomation.dal;

import attendanceautomation.be.Student;
import java.util.ArrayList;

public class MockData {
    
    private ArrayList<Student> students;
    private int id;
    
    public ArrayList<Student> getAllStudents() {
        //can add students here too like in jeppe example
        
        return students;
    }
    
    public void createStudent(String name, double attendance) {
        id ++;
        Student e = new Student(name, attendance, id);
        students.add(e);
    }
    
    public Student editStudent(String name, double attendance) {
        Student e = new Student(name, attendance, id);
        return e;
    }
    
    public void removeStudent(Student e) {
        students.remove(e);
    }
    
    
}
