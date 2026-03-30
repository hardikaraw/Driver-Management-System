import java.sql.*;

public class Register {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/driverdb";
        String user = "root";
        String password = "Hardikshukla@1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            String query = "INSERT INTO drivers(name, license, experience, phone) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, "Hardik");
            ps.setString(2, "DL77777");
            ps.setInt(3, 3);
            ps.setString(4, "8888888888");

            ps.executeUpdate();

            System.out.println("🔥 Data Inserted Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}