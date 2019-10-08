package task3.enums;

import task3.enums.Courses;
import task3.enums.Faculties;
import task3.enums.Groups;
import task3.enums.Student;

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

    public List<Student> getStudents() {
        return students;
    }

    public List<Student> getStudentsByFaculty(Faculties faculty) {
        List<Student> tempList = new ArrayList<>();
        for (Student student : students)
            if (student.getFaculty().equals(faculty)) {
                tempList.add(student);
            }
        return tempList;
    }

    public List<Student> getStudentsByCourseFaculty(Faculties faculty, Courses course) {
        List<Student> tempList = new ArrayList<>();
        for (Student student : students)
            if(student.getFaculty().equals(faculty) && student.getCourse().equals(course)){
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

    public List<Student> getStudentsByGroup(Groups group) {
        List<Student> tempList = new ArrayList<>();
        for (Student student : students)
            if (student.getGroup().equals(group))
                tempList.add(student);
        return tempList;
    }
}
