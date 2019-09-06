package task3_Enums;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Main.getPersons();
        University university = new University("VNTU", students);
        List<Student> studentsByFaculty = university.getStudentsByFaculty(Faculties.FITKI);
        System.out.println("\n Students: " + studentsByFaculty);
        List<Student> studentsByCourseFaculty = university.getStudentsByCourseFaculty(Faculties.FITKI, Courses.FIRST);
        System.out.println("\n Student with faculty FITKI and course 1: " + studentsByCourseFaculty);
        List<Student> studentsByYear = university.getStudentsByYear(1995);
        System.out.println("\n Students were born after 1995 year: " + studentsByYear);
        List<Student> studentsByGroup = university.getStudentsByGroup(Groups.KN);
        System.out.println("\n All students of 2KN-13b group" + studentsByGroup);
        Faculties.getFaculties();
        List<Faculties> allFaculties = Faculties.getFaculties();
        System.out.println("\n All faculties: " +allFaculties);
        List<Groups> allGroups = Groups.getGroups();
        System.out.println("\n All groups: " + allGroups);
        List<Courses> allCourses = Courses.getCourses();
        System.out.println("\n All courses: " +allCourses);
    }

    private static List<Student> getPersons() {
        List<Student> persons = new ArrayList<>();
        persons.add(new Student("Samchuk", "Ira", getDate("1994-05-19"), 1, Faculties.FITKI, Courses.FIRST, Groups.KN));
        persons.add(new Student("Voluk", "Andry", getDate("1995-05-19"), 2, Faculties.FITKI, Courses.FIRST, Groups.KN));
        persons.add(new Student("Bushko", "Oleg", getDate("1993-05-19"), 3, Faculties.FCSA, Courses.SECOND, Groups.NT));
        persons.add(new Student("Kravchuk", "Ivan", getDate("1992-05-19"), 3, Faculties.FITKI, Courses.FOURTH, Groups.PI));
        persons.add(new Student("Mix", "Oleg", getDate("1998-05-19"), 3, Faculties.FCSA, Courses.FOURTH, Groups.NT));
        persons.add(new Student("Bushkov", "Andry", getDate("1994-05-19"), 3, Faculties.FITKI, Courses.FOURTH, Groups.KN));
        persons.add(new Student("Nesterenko", "Max", getDate("1995-05-19"), 3, Faculties.FMIB, Courses.THIRD, Groups.M));
        persons.add(new Student("Levena", "Oksana", getDate("1996-05-19"), 3, Faculties.FMIB, Courses.THIRD, Groups.M));
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

