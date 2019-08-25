package task1_ArrayList;
import  java.util.ArrayList;

public class PersonsList {
    public ArrayList<Person> getPersons(){
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Ira", "Samchuk",23));
        persons.add(new Person("Olga", "Versus",20));
        persons.add(new Person("Olga", "Misto",19));
        persons.add(new Person("Oleg", "Velychko",22));
        persons.add(new Person("Oksana", "Panasuk",22));
        persons.add(new Person("Orest", "Bogdanov",25));
        persons.add(new Person("Dmytro", "Tasmuk",24));
        persons.add(new Person("Alex", "Lanovenko",27));
        persons.add(new Person("Yulia", "Nova",25));
        persons.add(new Person("Misha", "Blue",26));
        return persons;
    }
}
