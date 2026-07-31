package MiniProject;

import java.util.Scanner;

public class Scenario3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UserDAO dao = new UserDAO();

        System.out.print("Enter User ID: ");
        String userId = sc.nextLine();

        String result = dao.changeUserType(userId);

        System.out.println(result);

        sc.close();
    }
}