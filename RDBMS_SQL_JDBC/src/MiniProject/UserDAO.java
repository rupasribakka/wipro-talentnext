package MiniProject;

import java.sql.*;
import java.util.ArrayList;

public class UserDAO {

    Connection con = DBConnection.getConnection();

    // Scenario 1
    public String getUserType(String userID) {

        String userType = "";

        try {

            String sql = "SELECT USERTYPE FROM USERS WHERE USERID=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userID);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                userType = rs.getString("USERTYPE");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return userType;
    }

    // Scenario 2
    public String getIncorrectAttempts(String userID) {

        String message = "";

        try {

            String sql = "SELECT INCORRECTATTEMPTS FROM USERS WHERE USERID=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userID);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                int attempts = rs.getInt("INCORRECTATTEMPTS");

                if (attempts == 0)
                    message = "No Incorrect Attempt";
                else if (attempts == 1)
                    message = "One Time";
                else
                    message = "Incorrect Attempt Exceeded";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return message;
    }

    // Scenario 3
    public String changeUserType(String userID) {

        try {

            String sql = "UPDATE USERS SET USERTYPE='Admin' WHERE USERID=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userID);

            int i = ps.executeUpdate();

            if (i > 0)
                return "Update Success";

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Update Failed";
    }

    // Scenario 4
    public int getLockStatus() {

        int count = 0;

        try {

            String sql = "SELECT COUNT(*) FROM USERS WHERE LOCKSTATUS=0";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                count = rs.getInt(1);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return count;
    }

    // Scenario 5
    public String changeName(String id, String newName) {

        try {

            String sql = "UPDATE USERS SET NAME=? WHERE USERID=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, newName);
            ps.setString(2, id);

            int i = ps.executeUpdate();

            if (i > 0)
                return "Success";

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Failure";
    }

    // Scenario 6
    public String changePassword(String password) {

        try {

            String sql = "UPDATE USERS SET PASSWORD=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, password);

            int i = ps.executeUpdate();

            if (i > 0)
                return "Changed";

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Failed";
    }

    // Scenario 7
    public String addUser1(UserBean user) {

        try {

            String sql = "INSERT INTO USERS VALUES(?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, user.getUserId());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getName());
            ps.setInt(4, user.getIncorrectAttempts());
            ps.setInt(5, user.getLockStatus());
            ps.setString(6, user.getUserType());

            int i = ps.executeUpdate();

            if (i > 0)
                return "Success";

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Fail";
    }

    // Scenario 8
    public String addUser2(UserBean user) {

        if (user.getLockStatus() != 0)
            return "Fail";

        return addUser1(user);
    }

    // Scenario 9
    public ArrayList<UserBean> getUsers(String userType) {

        ArrayList<UserBean> list = new ArrayList<>();

        try {

            String sql = "SELECT * FROM USERS WHERE USERTYPE=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, userType);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                UserBean user = new UserBean();

                user.setUserId(rs.getString("USERID"));
                user.setPassword(rs.getString("PASSWORD"));
                user.setName(rs.getString("NAME"));
                user.setIncorrectAttempts(rs.getInt("INCORRECTATTEMPTS"));
                user.setLockStatus(rs.getInt("LOCKSTATUS"));
                user.setUserType(rs.getString("USERTYPE"));

                list.add(user);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // Scenario 10
    public ArrayList<UserBean> storeAllRecords() {

        ArrayList<UserBean> list = new ArrayList<>();

        try {

            String sql = "SELECT * FROM USERS";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                UserBean user = new UserBean();

                user.setUserId(rs.getString("USERID"));
                user.setPassword(rs.getString("PASSWORD"));
                user.setName(rs.getString("NAME"));
                user.setIncorrectAttempts(rs.getInt("INCORRECTATTEMPTS"));
                user.setLockStatus(rs.getInt("LOCKSTATUS"));
                user.setUserType(rs.getString("USERTYPE"));

                list.add(user);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // Scenario 11
    public String[] getNames() {

        ArrayList<String> names = new ArrayList<>();

        try {

            String sql = "SELECT NAME FROM USERS";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                names.add(rs.getString("NAME"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return names.toArray(new String[0]);
    }

}