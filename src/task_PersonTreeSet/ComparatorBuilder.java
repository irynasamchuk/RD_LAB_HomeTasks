package task_PersonTreeSet;
import java.util.Comparator;

public class ComparatorBuilder {
    public Comparator<Person> setComparator() {
        Comparator<Person> personsCompare;
        personsCompare = new CompareByAge().thenComparing(new CompareByName());
        return personsCompare;
    }

    public Comparator<Person> setComparatorReversed(){
        Comparator<Person> personsCompareReversed;
        CompareByAge compareByAge = new CompareByAge();
        personsCompareReversed = new CompareByName().thenComparing(compareByAge.reversed());
        return personsCompareReversed;
    }
}
