package MiniProject;

public class Scenario11 {

    public static void main(String[] args) {

        UserDAO dao = new UserDAO();

        String[] names = dao.getNames();

        System.out.println("User Names");
        System.out.println("----------");

        for(String name : names) {
            System.out.println(name);
        }

    }

}