package task3_Enums;

import java.util.ArrayList;
import java.util.List;

public enum Courses {
    FIRST,
    SECOND,
    THIRD,
    FOURTH;

    public static List<Courses> getCourses(){
        List<Courses> tempList = new ArrayList<>();
        for(Courses course : Courses.values()){
            tempList.add(course);
        }
        return tempList;
    }
}
