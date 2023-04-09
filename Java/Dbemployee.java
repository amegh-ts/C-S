import java.sql.*;
import java.util.*;

public class Dbemployee {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Properties p = new Properties();
        p.put("user", "root");
        p.put("password", "root");
        Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1/db2023", p);
        Statement s = c.createStatement();
        System.out.println("Employee Details");
        System.out.println("ID Name Designation Department");
        String str = "SELECT * FROM employee";
        ResultSet rs = s.executeQuery(str);
        while (rs.next()) {
            System.out.println(" " + rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " ");
        }
        c.close();
    }
}
