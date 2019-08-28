package task2_Collections;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PersonsList persons = new PersonsList();
        ArrayList<Student> students = persons.getPersons();
        University university = new University("VNTU",students);
        university.getStudentByFaculty("FITKI");
        university.getStudentByCourseFaculty("FITKI",1);
        university.getStudentByYear(1995);
        university.getStudentsByGroup("2KN-13b");
    }
}
