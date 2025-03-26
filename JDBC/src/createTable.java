import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class createTable {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password = "krn@mysql1";

    public static void main(String[] args) throws SQLException {
        String CreateQuery = "CREATE TABLE table1 (col1 int,col2 varchar(10))";
        Connection con= null;
        try {
            con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(CreateQuery);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            con.close();
        }
    }
}
