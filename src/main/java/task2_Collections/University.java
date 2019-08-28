package task2_Collections;

import java.util.ArrayList;

public class University {
    public String name;
    private ArrayList<Student> students;

    public University(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    public void getStudentByFaculty(String faculty) {
        ArrayList<String> tempList = new ArrayList<>();
        for (Student student : students)
            if (student.getFaculty().equals(faculty)){
                tempList.add(student.getLastName());
            }
        System.out.println("Students: " +tempList);
    }

    public void getStudentByCourseFaculty (String faculty, int course) {
        ArrayList<String> tempList = new ArrayList<>();
        for(Student student : students)
            if(student.getFaculty().equals(faculty) && student.getCourse()==course)
                tempList.add(student.getLastName());
        System.out.println("Student with " +faculty +  " and course " + course + " : " + tempList);
    }

    public void getStudentByYear(int year) {
        ArrayList<String> tempList = new ArrayList<>();
        for(Student student : students)
            if(student.getBirthday() > year)
                tempList.add(student.getLastName());
        System.out.println("Students were born after  " + year + " year: " +tempList);
    }
  
    public void getStudentsByGroup(String group) {
        ArrayList<String> tempList = new ArrayList<>();
        for(Student student : students)
            if(student.getGroup().equals(group))
                tempList.add(student.getLastName());
        System.out.println("All students of  " +group + ": " + tempList);
    }
}
