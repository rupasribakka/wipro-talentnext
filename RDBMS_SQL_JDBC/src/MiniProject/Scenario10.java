package MiniProject;

import java.util.ArrayList;

public class Scenario10 {

    public static void main(String[] args) {

        UserDAO dao = new UserDAO();

        ArrayList<UserBean> list = dao.storeAllRecords();

        if(list.isEmpty()) {

            System.out.println("No Records Found");

        } else {

            System.out.println("---------------------------------------------------------------");
            System.out.println("USERID\tPASSWORD\tNAME\tATTEMPTS\tLOCK\tTYPE");
            System.out.println("---------------------------------------------------------------");

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
    }
}