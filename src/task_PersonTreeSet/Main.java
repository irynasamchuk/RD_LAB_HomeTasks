package task_PersonTreeSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ComparatorBuilder myComparator1 = new ComparatorBuilder();
        Comparator<Person> comparator = myComparator1.setComparator();
        PersonsBuilder getPersons = new PersonsBuilder();
        TreeSet<Person> persons = getPersons.getPersons(comparator);

        Iterator<Person> iterator = persons.iterator();
        System.out.println("\n Персони відсортовані за віком, а потім за назвою:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ComparatorBuilder getComparatorReversed = new ComparatorBuilder();
        Comparator<Person> myComparator2 = getComparatorReversed.setComparatorReversed();
        PersonsBuilder getPersons2 = new PersonsBuilder();
        TreeSet<Person> persons2 = getPersons2.getPersons(myComparator2);

        Iterator<Person> iterator1 = persons2.iterator();
        System.out.println("\n Персони відсортовані за назвою,а потім за спаданням віку:");
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
