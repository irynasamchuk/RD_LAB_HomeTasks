package task3.enums;

import java.util.ArrayList;
import java.util.List;

public enum Groups {
    KN("Computer Science", Faculties.FITKI),
    PI("Software Engineering", Faculties.FITKI),
    NT("New Technologies", Faculties.FCSA),
    M("Management", Faculties.FMIB);

    private String name;
    private Faculties faculty;

    Groups(String name, Faculties faculty) {
        this.name = name;
        this.faculty = faculty;
    }

    public static List<Groups> getGroups(){
        List<Groups> tempList = new ArrayList<>();
        for(Groups group : Groups.values()){
            tempList.add(group);
        }
        return tempList;
    }
}
