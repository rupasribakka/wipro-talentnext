package PreparedStatement_MetaData;

import java.sql.*;

public class DAOClass {

    Connection con;

    public DAOClass() {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                    "hr",
                    "hr");

            System.out.println("Database Connected Successfully");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // INSERT
    public void insert(int rollno, String name, String standard,
                       String doj, int fees) {

        try {

            String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, rollno);
            ps.setString(2, name);
            ps.setString(3, standard);
            ps.setDate(4, Date.valueOf(doj));
            ps.setInt(5, fees);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Record Inserted");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // DELETE
    public void delete(int rollno) {

        try {

            String sql = "DELETE FROM STUDENT WHERE ROLLNO=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, rollno);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Record Deleted");
            else
                System.out.println("Record Not Found");

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    // MODIFY FEES
    public void modify(int rollno, int fees) {

        try {

            String sql = "UPDATE STUDENT SET FEES=? WHERE ROLLNO=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, fees);
            ps.setInt(2, rollno);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Record Updated");
            else
                System.out.println("Record Not Found");

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    // DISPLAY ONE RECORD
    public void display(int rollno) {

        try {

            String sql = "SELECT * FROM STUDENT WHERE ROLLNO=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, rollno);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("ROLLNO") + " " +
                        rs.getString("NAME") + " " +
                        rs.getString("STANDARD") + " " +
                        rs.getDate("DATE_OF_JOINING") + " " +
                        rs.getInt("FEES"));

            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    // DISPLAY ALL RECORDS
    public void displayAll() {

        try {

            String sql = "SELECT * FROM STUDENT";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("ROLLNO") + " " +
                        rs.getString("NAME") + " " +
                        rs.getString("STANDARD") + " " +
                        rs.getDate("DATE_OF_JOINING") + " " +
                        rs.getInt("FEES"));

            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}