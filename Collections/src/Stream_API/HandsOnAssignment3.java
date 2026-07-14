package Stream_API;

import java.util.ArrayList;

public class HandsOnAssignment3 {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Rupa", 75));
        students.add(new Student(102, "Ammuu", 45));
        students.add(new Student(103, "Honey", 90));
        students.add(new Student(104, "John", 35));
        students.add(new Student(105, "Ramya", 60));

        long count = students.stream()
                .filter(s -> s.getMark() >= 50)
                .count();

        System.out.println("Number of students passed: " + count);
    }
}