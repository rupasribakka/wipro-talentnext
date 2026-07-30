package Executing_Query_Processing_Results;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Assignment2 {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                    "hr",
                    "hr");

            Statement stmt = con.createStatement();

            String query =
                    "SELECT ENAME, JOB, SAL, COMM FROM EMP " +
                    "WHERE SAL > 1000 AND SAL < 2000";

            ResultSet rs = stmt.executeQuery(query);

            System.out.println("ENAME\tJOB\tSAL\tCOMM");

            while (rs.next()) {

                System.out.println(
                        rs.getString("ENAME") + "\t" +
                        rs.getString("JOB") + "\t" +
                        rs.getDouble("SAL") + "\t" +
                        rs.getString("COMM"));

            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}