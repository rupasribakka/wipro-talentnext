package PreparedStatement_MetaData;

import java.sql.*;

public class Assignment2 {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                    "hr",
                    "hr");

            String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            // Record 1
            ps.setInt(1, 201);
            ps.setString(2, "RAVI");
            ps.setString(3, "VI");
            ps.setDate(4, Date.valueOf("2008-05-10"));
            ps.setInt(5, 4500);

            ps.executeUpdate();

            // Record 2
            ps.setInt(1, 202);
            ps.setString(2, "SURESH");
            ps.setString(3, "VII");
            ps.setDate(4, Date.valueOf("2007-09-12"));
            ps.setInt(5, 5000);

            ps.executeUpdate();

            System.out.println("Records Inserted Successfully");

            ps.close();
            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }

    }

}