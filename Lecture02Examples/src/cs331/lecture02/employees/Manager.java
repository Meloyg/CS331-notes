package cs331.lecture02.employees;

//import org.apache.commons.lang3.builder.EqualsBuilder;
//import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Manager extends Employee {

    private List<Employee> responsibleFor = new ArrayList<>();

    public Manager(String name, String ssn, Manager manager) {
        super(name, ssn, manager);
    }

    public Manager(String name, String ssn) {
        super(name, ssn);
    }

    public List<Employee> getResponsibleFor() {
        return Collections.unmodifiableList(responsibleFor);
    }

    protected void addEmployee(Employee emp) {
        responsibleFor.add(emp);
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += System.lineSeparator();
        if (responsibleFor.size() > 0) {
            s += "Employees:" + System.lineSeparator();
            for (Employee e : responsibleFor) {
                s += "\t- " + e.getName() + System.lineSeparator();
            }
        } else {
            s += "Employees: None";
        }
        return s;
    }
}
