package task3.enums;

import task3.enums.Courses;
import task3.enums.Faculties;
import task3.enums.Groups;
import task3.enums.Person;

import java.util.Date;

public class Student extends Person {
    private int id;
    private Faculties faculty;
    private Courses course;
    private Groups group;

    public Student(String lastName, String firstName, Date birthday, int id, Faculties faculty, Courses course, Groups group) {
        super(lastName, firstName, birthday);
        this.id = id;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Faculties getFaculty() {
        return faculty;
    }

    public Courses getCourse() {
        return course;
    }

    public Groups getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + "\'" +
                ", firstName='" + firstName + "\'" +
                ", birthday='" + birthday + "\'" +
                ", id=" + id +
                ", faculty='" + faculty + "\'" +
                ", course=" + course +
                ", group='" + group + "\'" +
                '}';
    }
}
