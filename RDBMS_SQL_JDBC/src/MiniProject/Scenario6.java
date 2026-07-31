package MiniProject;

import java.util.Scanner;

public class Scenario6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UserDAO dao = new UserDAO();

        System.out.print("Enter New Password: ");
        String password = sc.nextLine();

        String result = dao.changePassword(password);

        System.out.println(result);

        sc.close();
    }
}