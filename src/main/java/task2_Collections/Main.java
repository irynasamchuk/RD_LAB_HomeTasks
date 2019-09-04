package task2_Collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Main.getPersons();
        University university = new University("VNTU", students);
        List<Student> studentsByFaculty = university.getStudentsByFaculty("FITKI");
        System.out.println("Students: " + studentsByFaculty);
        List<Student> studentsByCourseFaculty = university.getStudentsByCourseFaculty("FITKI", 1);
        System.out.println("Student with faculty FITKI and course 1: " + studentsByCourseFaculty);
        List<Student> studentsByYear = university.getStudentsByYear(1995);
        System.out.println("Students were born after 1995 year: " + studentsByYear);
        List<Student> studentsByGroup = university.getStudentsByGroup("2KN-13b");
        System.out.println("All students of 2KN-13b group" + studentsByGroup);
    }

    private static List<Student> getPersons() {
        List<Student> persons = new ArrayList<>();
        persons.add(new Student("Samchuk", "Ira", getDate("1994-05-19"), 1, "FITKI", 1, "2KN-13b"));
        persons.add(new Student("Voluk", "Andry", getDate("1995-05-19"), 2, "FITKI", 1, "2KN-13b"));
        persons.add(new Student("Bushko", "Oleg", getDate("1993-05-19"), 3, "FCSA", 4, "2NT-12b"));
        persons.add(new Student("Kravchuk", "Ivan", getDate("1992-05-19"), 3, "FITKI", 4, "2KI-12b"));
        persons.add(new Student("Mix", "Oleg", getDate("1998-05-19"), 3, "FMIB", 4, "2NT-12b"));
        persons.add(new Student("Bushkov", "Andry", getDate("1994-05-19"), 3, "FITKI", 4, "2KN-13b"));
        persons.add(new Student("Nesterenko", "Max", getDate("1995-05-19"), 3, "FMIB", 4, "1M-12b"));
        persons.add(new Student("Levena", "Oksana", getDate("1996-05-19"), 3, "FCSA", 4, "2NL-12b"));
        return persons;
    }

    public static Date getDate(String birthday) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = dateFormat.parse(String.valueOf(birthday));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}

