package Functional_Interface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class HandsOnAssignment4 {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Rupa", "Guntur", 8000));
        employees.add(new Employee(2, "Ammuu", "Hyderabad", 5000));
        employees.add(new Employee(3, "Sita", "Chennai", 9000));
        employees.add(new Employee(4, "John", "Bangalore", 20000));
        employees.add(new Employee(5, "David", "Mumbai", 70000));

        Predicate<Employee> p =
                emp -> emp.getSalary() < 10000;

        System.out.println("Employees with salary less than 10000:");

        for (Employee emp : employees) {

            if (p.test(emp)) {
                System.out.println(emp.getName());
            }
        }
    }
}