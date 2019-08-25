package task_PersonTreeSet;
import java.util.Comparator;
import java.util.TreeSet;

public class PersonsBuilder {
    public TreeSet<Person> getPersons(Comparator<Person> myComparator){
        TreeSet<Person> people = new TreeSet<>(myComparator);
        people.add(new Person("Ira", 33));
        people.add(new Person("Olga", 32));
        people.add(new Person("Max", 10));
        people.add(new Person("Vadim", 32));
        people.add(new Person("Vadim", 27));
        people.add(new Person("Kevin", 9));
        people.add(new Person("Artem", 35));
        people.add(new Person("Artem", 27));
        return people;
    }
}
