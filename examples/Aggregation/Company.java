package Aggregation;

import java.util.List;

/**
 * Represents a Company.
 * 
 * UML Concept: Aggregation
 * - Company "has" Employees
 * - Employees can exist without the Company
 */
public class Company {

    // Aggregation relationship (weak ownership)
    private List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }
}
