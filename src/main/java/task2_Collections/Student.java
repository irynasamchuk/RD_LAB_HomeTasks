package task2_Collections;

import java.util.Date;

public class Student extends Person {
    private int id;
    private String faculty;
    private int course;
    private String group;

    public Student(String lastName, String firstName, Date birthday, int id, String  faculty, int course, String group) {
        super(lastName, firstName, birthday);
        this.id = id;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
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
