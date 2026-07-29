package EstablishingConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Assignment1 {

    public static void main(String[] args) {

        try {
          
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "hr", "hr");
            if (con != null) {
                System.out.println("Connection Established successfully");
            }
        
            con.close();

        } catch (Exception e) {

            System.out.println("Connection could not be established");
            System.out.println(e.getMessage());

        }

    }

}