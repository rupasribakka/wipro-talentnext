package PreparedStatement_MetaData;

import java.sql.*;

public class Assignment4 {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                    "hr",
                    "hr");

            int rollno = Integer.parseInt(args[0]);
            double fees = Double.parseDouble(args[1]);

            String sql = "UPDATE STUDENT SET FEES=? WHERE ROLLNO=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(1, fees);
            ps.setInt(2, rollno);

            int i = ps.executeUpdate();

            if (i > 0)
                System.out.println("Record Updated Successfully");
            else
                System.out.println("Student Not Found");

            con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}