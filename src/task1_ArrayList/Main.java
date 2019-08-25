package task1_ArrayList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PersonsList persons = new PersonsList();
        ArrayList employees = persons.getPersons();
        Company myCompany = new Company("Life", employees);
        myCompany.countEmployees(employees);
        myCompany.getEmployeeByName("Oleg");
        myCompany.getEmployeeByLastName("Samchuk");
    }
}
