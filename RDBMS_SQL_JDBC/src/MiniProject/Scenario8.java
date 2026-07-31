package MiniProject;

import java.util.Scanner;

public class Scenario8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UserBean user = new UserBean();

        System.out.print("Enter User ID : ");
        user.setUserId(sc.nextLine());

        System.out.print("Enter Password : ");
        user.setPassword(sc.nextLine());

        System.out.print("Enter Name : ");
        user.setName(sc.nextLine());

        System.out.print("Enter Incorrect Attempts : ");
        user.setIncorrectAttempts(sc.nextInt());

        System.out.print("Enter Lock Status (0/1) : ");
        user.setLockStatus(sc.nextInt());

        sc.nextLine();

        System.out.print("Enter User Type : ");
        user.setUserType(sc.nextLine());

        UserDAO dao = new UserDAO();

        String result = dao.addUser2(user);

        System.out.println(result);

        sc.close();
    }
}