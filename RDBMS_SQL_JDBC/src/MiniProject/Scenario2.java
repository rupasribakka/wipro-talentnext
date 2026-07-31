package MiniProject;

import java.util.Scanner;

public class Scenario2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UserDAO dao = new UserDAO();

        System.out.print("Enter User ID: ");
        String userId = sc.nextLine();

        String result = dao.getIncorrectAttempts(userId);

        if (!result.equals(""))
            System.out.println(result);
        else
            System.out.println("User ID Not Found");

        sc.close();
    }
}