package MiniProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Scenario9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UserDAO dao = new UserDAO();

        System.out.print("Enter User Type (Admin/Employee): ");
        String type = sc.nextLine();

        ArrayList<UserBean> list = dao.getUsers(type);

        if(list.isEmpty()) {

            System.out.println("No Records Found");

        } else {

            System.out.println("\nUSERID\tPASSWORD\tNAME\tATTEMPTS\tLOCK\tTYPE");

            for(UserBean user : list) {

                System.out.println(
                        user.getUserId() + "\t" +
                        user.getPassword() + "\t" +
                        user.getName() + "\t" +
                        user.getIncorrectAttempts() + "\t\t" +
                        user.getLockStatus() + "\t" +
                        user.getUserType());
            }
        }

        sc.close();
    }
}