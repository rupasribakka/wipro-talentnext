package CallableStatement;

import java.sql.*;

public class Assignment1 {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                    "hr",
                    "hr");
            System.out.printf("%-8s %-15s %-10s\n",
                    "EMPNO", "ENAME", "NET SALARY");
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                    "SELECT EMPNO, ENAME FROM EMP");

            while (rs.next()) {

                int empno = rs.getInt("EMPNO");
                String ename = rs.getString("ENAME");

                CallableStatement cs =
                        con.prepareCall("{call CAL_NETSAL(?,?)}");

                cs.setInt(1, empno);

                cs.registerOutParameter(2, Types.DOUBLE);

                cs.execute();

                double netsal = cs.getDouble(2);

                System.out.printf("%-8d %-15s %.2f\n",
                        empno, ename, netsal);

                cs.close();
            }

            rs.close();
            st.close();
            con.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}