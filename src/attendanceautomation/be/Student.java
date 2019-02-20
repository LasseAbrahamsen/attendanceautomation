package attendanceautomation.be;

public class Student {

    private String name;
    private double attendance;
    private int id;

    public Student(String name, double attendance, int id) {
        this.name = name;
        this.attendance = attendance;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttendance() {
        return attendance;
    }

    public void setAttendance(double attendance) {
        this.attendance = attendance;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
}
