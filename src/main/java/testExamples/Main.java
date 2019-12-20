package testExamples;

import task1_ArrayList.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static int x = 10;
    static int y = 20;

    public void Canculate1(Priantable priantable){
        priantable.print();
    }

    public static void main(String[] args) {

        Main mainTest = new Main();
        Books book = new Books();
        Journal journal = new Journal();

        List<Priantable> list = new ArrayList<>();
        list.add(book);
        list.add(journal);

        for (Priantable print : list) {
            print.print();
        }

        book.setName("Harry Potter");
        System.out.println(book.getName());
        mainTest.Canculate1(book);

        Operationable<Integer> operationable;
        operationable = () -> 3;

        System.out.println(operationable.Method());

        Operationable<Integer> operationable1 = () ->{ x = 30;
        return x + y;
        };
        System.out.println(operationable1.Method());
        System.out.println(x);

        int n=70;
        int m=30;

        Operationable<Integer> operationable2 = () -> { return  n + m;
        };
        System.out.println(operationable2.Method());
    }

    public void streamExample(){
        List<Person> persons = new ArrayList<>();
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


    }
}

     interface Operationable<T> {
        T Method();
    }










