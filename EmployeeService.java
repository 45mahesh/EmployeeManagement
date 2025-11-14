package service;

import model.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private final List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee findById(int id) {
        return employees.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
