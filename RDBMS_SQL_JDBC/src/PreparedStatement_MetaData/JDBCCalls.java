package PreparedStatement_MetaData;

public class JDBCCalls {

    public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        if (args.length == 0) {

            System.out.println("Please Enter Program Arguments");
            return;

        }

        int option = Integer.parseInt(args[0]);

        switch (option) {

        case 1:

            dao.insert(
                    Integer.parseInt(args[1]),
                    args[2],
                    args[3],
                    args[4],
                    Integer.parseInt(args[5]));

            break;

        case 2:

            dao.delete(Integer.parseInt(args[1]));

            break;

        case 3:

            dao.modify(
                    Integer.parseInt(args[1]),
                    Integer.parseInt(args[2]));

            break;

        case 4:

            if (args.length == 2)
                dao.display(Integer.parseInt(args[1]));
            else
                dao.displayAll();

            break;

        default:

            System.out.println("Invalid Option");

        }

    }

}