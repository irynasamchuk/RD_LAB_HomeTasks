package task3.enums;

import java.util.ArrayList;
import java.util.List;

public enum Faculties {
    FITKI("Faculty of Information Technology and Computer Engineering"),
    FCSA("Faculty of Computer Systems and Automation"),
    FMIB("Faculty of Management and Information Security");
    private String name;
    Faculties(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<Faculties> getFaculties(){
        List<Faculties> tempList = new ArrayList<>();
        for(Faculties faculty : Faculties.values()){
            tempList.add(faculty);
        }
        return tempList;
    }
}
