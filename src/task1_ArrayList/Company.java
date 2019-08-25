package task1_ArrayList;
import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Person> employees;

    public Company(String companyName, ArrayList<Person> employees) {
        this.companyName = companyName;
        this.employees = employees;

    }

    public void countEmployees(ArrayList employees) {
        System.out.println("Company contains " + employees.size() + " employees.");
    }

    public void getEmployeeByName(String firstName) {
        for (Person employee : employees) {
            if (employee.getFirstName().equals(firstName))
                System.out.println("Yes, company has the employee with name: " + firstName + ".");
        }
    }

    public void getEmployeeByLastName(String lastName) {
        for (Person employee : employees) {
            if (employee.getLastName().contains(lastName))
                System.out.println("Yes, company has the employee with surname: " + lastName + ".");
        }

    }

}
