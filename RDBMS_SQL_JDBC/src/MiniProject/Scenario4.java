package MiniProject;

public class Scenario4 {

    public static void main(String[] args) {

        UserDAO dao = new UserDAO();

        int count = dao.getLockStatus();

        System.out.println("Number of Unlocked Users : " + count);

    }

}