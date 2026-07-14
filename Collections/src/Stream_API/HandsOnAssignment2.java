package Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HandsOnAssignment2 {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Rupa", 20, "Pune"));
        employees.add(new Employee(102, "Ammuu", 21, "Hyderabad"));
        employees.add(new Employee(103, "Ramya", 22, "Pune"));
        employees.add(new Employee(104, "John", 23, "Chennai"));
        employees.add(new Employee(105, "Karthik", 24, "Pune"));

        List<Employee> puneEmployees = employees.stream()
                .filter(emp -> emp.getLocation().equals("Pune"))
                .collect(Collectors.toList());

        System.out.println("Employees from Pune:");

        puneEmployees.forEach(System.out::println);
    }
}