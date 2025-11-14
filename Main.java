import model.Employee;
import service.EmployeeService;

public class Main {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();

        service.addEmployee(new Employee(1, "Arjun", "IT", 55000));
        service.addEmployee(new Employee(2, "Meera", "HR", 48000));
        service.addEmployee(new Employee(3, "Rahul", "Finance", 60000));

        System.out.println("All Employees:");
        service.getAllEmployees().forEach(System.out::println);

        System.out.println("\nFind Employee with ID 2:");
        Employee e = service.findById(2);
        System.out.println(e != null ? e : "Not Found!");
    }
}
