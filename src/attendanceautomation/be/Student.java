package attendanceautomation.be;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Student {

    public static int TotalAttendableDates(int year) {
        // in theory this should take things like holidays, weekends and everything else
        // into account. But I'm not made of time or patience.
        if(year % 4 == 0) {
            return 366;
        }
        return 365;
    }
    public static int AttendableWeekdays(int year, int weekDay) {
        Calendar startOfYear = Calendar.getInstance();
        startOfYear.set(Calendar.DAY_OF_MONTH, 1);
        startOfYear.set(Calendar.MONTH, 1);
        startOfYear.set(Calendar.YEAR, 1);
        int numDays = 0;
        // maximum efficiency, checking every single day in the year <3
        // cuz we are obviously too retarded to devise a method that only searches for the first
        // matching week-day and then advances a full week each time (read: too retarded = too lazy)
        while(startOfYear.get(Calendar.YEAR) == year) {
            if (startOfYear.get(Calendar.DAY_OF_WEEK) == weekDay) {
                numDays++;
            }
            startOfYear.add(Calendar.DAY_OF_MONTH, 1);
        }
        return numDays;
    }
    
    private String name;
    private HashSet<Date> nonAttendedDates;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.nonAttendedDates = new HashSet<>();
        this.id = id;
    }
    
    public void addNonAttendedDate(Date date) {
        this.nonAttendedDates.add(date);
    }

    public double getAttendanceRatio(int year) {
        int numNonAttendedDates = 0;
        for (Date nonAttendedDate : nonAttendedDates) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(nonAttendedDate);
            if (calendar.get(Calendar.YEAR) == year) {
                numNonAttendedDates++;
            }
        }
        return 1.0 - ((double)numNonAttendedDates / Student.TotalAttendableDates(year));
    }
    
    public double getWeekdayAttendanceRatio(int year, int weekDay) {
        int numNonAttendedDates = 0;
        for (Date nonAttendedDate : nonAttendedDates) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(nonAttendedDate);
            if (calendar.get(Calendar.YEAR) == year && calendar.get(Calendar.DAY_OF_WEEK) == weekDay) {
                numNonAttendedDates++;
            }
        }
        return 1.0 - ((double)numNonAttendedDates / Student.AttendableWeekdays(year, weekDay));
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
}
