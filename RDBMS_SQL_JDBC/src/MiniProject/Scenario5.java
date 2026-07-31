package MiniProject;

import java.util.Scanner;

public class Scenario5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UserDAO dao = new UserDAO();

        System.out.print("Enter User ID: ");
        String userId = sc.nextLine();

        System.out.print("Enter New Name: ");
        String newName = sc.nextLine();

        String result = dao.changeName(userId, newName);

        System.out.println(result);

        sc.close();
    }
}