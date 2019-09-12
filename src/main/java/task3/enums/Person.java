package task3.enums;

import java.util.Date;

public class Person {
    protected String lastName;
    protected String firstName;
    protected String surname;
    protected Date birthday;
    protected String address;
    protected String phone;

    public Person(String lastName, String firstName, String surname, Date birthday, String address, String phone) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.surname = surname;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
    }

    public Person(String lastName, String firstName, Date birthday) {
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

    public Date getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + "\'" +
                ", firstName='" + firstName + "\'" +
                ", birthday=" + birthday +
                '}';
    }
}
