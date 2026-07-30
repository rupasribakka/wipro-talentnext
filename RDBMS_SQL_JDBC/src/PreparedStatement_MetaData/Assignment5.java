package PreparedStatement_MetaData;

import java.sql.*;

public class Assignment5 {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                    "hr",
                    "hr");

            if (args.length == 0) {

                // Display all students
                String sql = "SELECT * FROM STUDENT";

                PreparedStatement ps = con.prepareStatement(sql);

                ResultSet rs = ps.executeQuery();

                System.out.println("ROLLNO\tNAME\tSTANDARD\tDOB\t\tFEES");

                while (rs.next()) {

                    System.out.println(
                            rs.getInt("ROLLNO") + "\t" +
                            rs.getString("NAME") + "\t" +
                            rs.getString("STANDARD") + "\t" +
                            rs.getDate("DATE_OF_BIRTH") + "\t" +
                            rs.getDouble("FEES"));
                }

            } else {

                // Display one student
                String sql = "SELECT * FROM STUDENT WHERE ROLLNO=?";

                PreparedStatement ps = con.prepareStatement(sql);

                ps.setInt(1, Integer.parseInt(args[0]));

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {

                    System.out.println("ROLLNO\tNAME\tSTANDARD\tDOB\t\tFEES");

                    System.out.println(
                            rs.getInt("ROLLNO") + "\t" +
                            rs.getString("NAME") + "\t" +
                            rs.getString("STANDARD") + "\t" +
                            rs.getDate("DATE_OF_BIRTH") + "\t" +
                            rs.getDouble("FEES"));

                } else {

                    System.out.println("Student Not Found");

                }

            }

            con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}