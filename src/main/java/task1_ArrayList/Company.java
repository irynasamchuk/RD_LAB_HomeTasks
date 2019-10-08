package task1_ArrayList;
import java.util.List;

public class Company {
    private String companyName;
    private List<Person> employees;

    public Company(String companyName, List<Person> employees) {
        this.companyName = companyName;
        this.employees = employees;
    }

    public void countEmployees(List<Person> employees) {
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
