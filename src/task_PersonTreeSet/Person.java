package task_PersonTreeSet;

public class Person {
    private String Name;
    private int age;

    public Person(String name, int age) {
        Name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }

}
