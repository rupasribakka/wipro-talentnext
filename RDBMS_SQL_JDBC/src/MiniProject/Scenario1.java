package MiniProject;

import java.util.Scanner;

public class Scenario1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UserDAO dao = new UserDAO();

        System.out.print("Enter User ID: ");
        String userId = sc.nextLine();

        String userType = dao.getUserType(userId);

        if (!userType.equals(""))
            System.out.println("User Type : " + userType);
        else
            System.out.println("User ID Not Found");

        sc.close();
    }
}