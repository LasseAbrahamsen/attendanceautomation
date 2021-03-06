package attendanceautomation.dal;

import attendanceautomation.be.Student;
import java.util.ArrayList;

public class MockData {
    
    private ArrayList<Student> students = new ArrayList();
    private int id;
    
    public ArrayList<Student> getAllStudents() {
        //can add students here too like in jeppe example

        /*students.clear();
        Student Lasse = new Student("Lasse", 88.0, 1);
        students.add(Lasse);
        Student Ajay = new Student("Ajay", 52.1, 2);
        students.add(Ajay);*/
        return students;
    }
    
    public void createStudent(String name) {
        id ++;
        Student e = new Student(name, id);
        students.add(e);
    }
    
    public Student getStudent(String name) {
        for(Student s : students) {
            if(s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }
    
    public void removeStudent(Student e) {
        students.remove(e);
    }
    
    
}
