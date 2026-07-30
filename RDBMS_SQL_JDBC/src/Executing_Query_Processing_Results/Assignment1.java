package Executing_Query_Processing_Results;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Assignment1 {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                    "hr",
                    "hr");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");

            System.out.println("EMPNO\tENAME");

            while (rs.next()) {

                System.out.println(
                        rs.getInt(1) + "\t" +
                        rs.getString("ENAME"));

            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}