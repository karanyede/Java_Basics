import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deleteStudent {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password = "krn@mysql1";

    public static void main(String[] args) throws ClassNotFoundException {
        String deleteQuery = "DELETE FROM STUDENT WHERE ID=?;";
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(deleteQuery);
            ps.setInt(1,4);
            int update =ps.executeUpdate();
            System.out.println("Data Daleted...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
