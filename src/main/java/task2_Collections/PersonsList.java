package task2_Collections;

import java.util.ArrayList;

public class PersonsList {
    public ArrayList<Student> getPersons(){
        ArrayList<Student> persons = new ArrayList<>();
        persons.add(new Student("Samchuk", "Ira", 1998, 1, "FITKI", 1,"2KN-13b"));
        persons.add(new Student("Voluk", "Andry", 1995, 2, "FITKI", 1,"2KN-13b"));
        persons.add(new Student("Bushko", "Oleg", 1996, 3, "FCSA", 4,"2NT-12b"));
        persons.add(new Student("Kravchuk", "Ivan", 1996, 3, "FITKI", 4,"2KI-12b"));
        persons.add(new Student("Mix", "Oleg", 1994, 3, "FMIB", 4,"2NT-12b"));
        persons.add(new Student("Bushkov", "Andry", 1994, 3, "FITKI", 4,"2KN-13b"));
        persons.add(new Student("Nesterenko", "Max", 1993, 3, "FMIB", 4,"1M-12b"));
        persons.add(new Student("Levena", "Oksana", 1993, 3, "FCSA", 4,"2NL-12b"));
        return persons;
    }
}
