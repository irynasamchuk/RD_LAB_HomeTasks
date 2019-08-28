package task2_Collections;

public class Person {
    private String lastName;
    private String firstName;
    private String surname;
    private int birthday;
    private String address;
    private int phone;

    public Person(String lastName, String firstName, String surname, int birthday, String address, int phone) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.surname = surname;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
    }

    public Person(String lastName, String firstName, int birthday) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
