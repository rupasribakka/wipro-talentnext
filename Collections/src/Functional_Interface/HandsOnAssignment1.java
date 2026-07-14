package Functional_Interface;

import java.util.ArrayList;
import java.util.function.Function;

public class HandsOnAssignment1 {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Rupa", "Guntur", 30000));
        employees.add(new Employee(2, "Ammuu", "Vijayawada", 25000));
        employees.add(new Employee(3, "Sita", "Hyderabad", 40000));
        employees.add(new Employee(4, "Karthik", "Chennai", 35000));
        employees.add(new Employee(5, "David", "Bangalore", 45000));

        Function<Employee, String> getLocation =
                emp -> emp.getLocation();

        ArrayList<String> locations = new ArrayList<>();

        for (Employee emp : employees) {
            locations.add(getLocation.apply(emp));
        }

        System.out.println("Locations:");
        locations.forEach(System.out::println);
    }
}