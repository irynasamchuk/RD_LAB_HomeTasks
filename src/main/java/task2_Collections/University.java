package task2_Collections;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class University {
    public String name;
    private List<Student> students;

    public University(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public List<Student> getStudentsByFaculty(String faculty) {
        List<Student> tempList = new ArrayList<>();
        for (Student student : students)
            if (student.getFaculty().equals(faculty)) {
                tempList.add(student);
            }
        return tempList;
    }

    public List<Student> getStudentsByCourseFaculty(String faculty, int course) {
        List<Student> tempList = new ArrayList<>();
        for (Student student : students)
            if (student.getFaculty().equals(faculty) && student.getCourse() == course) {
                tempList.add(student);
            }
        return tempList;
    }

    public List<Student> getStudentsByYear(int year) {
        List<Student> tempList = new ArrayList<>();
        for (Student student : students) {
            Date birthday = student.getBirthday();
            SimpleDateFormat onlyYear = new SimpleDateFormat("yyyy");
            int yearFromBirthday = Integer.parseInt(onlyYear.format(birthday));
            if (yearFromBirthday > year)
                tempList.add(student);
        }
        return tempList;
    }

    public List<Student> getStudentsByGroup(String group) {
        List<Student> tempList = new ArrayList<>();
        for (Student student : students)
            if (student.getGroup().equals(group))
                tempList.add(student);
        return tempList;
    }
}
