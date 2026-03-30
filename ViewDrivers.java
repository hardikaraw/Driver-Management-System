import java.sql.*;

public class ViewDrivers {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // driver load

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/driverdb",
                "root",
                "Hardikshukla@1234"
            );

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM drivers");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getString("license") + " " +
                    rs.getInt("experience") + " " +
                    rs.getString("phone")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}