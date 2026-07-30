package PreparedStatement_MetaData;

import java.sql.*;

public class Assignment3 {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                    "hr",
                    "hr");

            int rollno = Integer.parseInt(args[0]);

            // Find student
            PreparedStatement ps1 = con.prepareStatement(
                    "SELECT * FROM STUDENT WHERE ROLLNO=?");

            ps1.setInt(1, rollno);

            ResultSet rs = ps1.executeQuery();

            if (rs.next()) {

                // Insert into STUDENTLOG
                PreparedStatement ps2 = con.prepareStatement(
                        "INSERT INTO STUDENTLOG VALUES(?,?,?,SYSDATE)");

                ps2.setInt(1, rs.getInt("ROLLNO"));
                ps2.setString(2, rs.getString("NAME"));
                ps2.setString(3, rs.getString("STANDARD"));

                ps2.executeUpdate();

                // Delete from STUDENT
                PreparedStatement ps3 = con.prepareStatement(
                        "DELETE FROM STUDENT WHERE ROLLNO=?");

                ps3.setInt(1, rollno);

                int i = ps3.executeUpdate();

                if (i > 0)
                    System.out.println("Record Deleted Successfully");
                else
                    System.out.println("Deletion Failed");

            } else {

                System.out.println("Student Not Found");

            }

            con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}