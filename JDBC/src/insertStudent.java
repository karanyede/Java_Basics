import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insertStudent {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password = "krn@mysql1";

    public static void main(String[] args) throws ClassNotFoundException {
        String insertQuery = "INSERT INTO student(NAME,AGE,MARKS) VALUES (?,?,?);";
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(insertQuery);
            ps.setString(1, "Gagan");
            ps.setInt(2, 21);
            ps.setDouble(3, 88);
            ps.executeUpdate();
            System.out.println("data 1 Inserted ...");
            ps.setString(1, "Aman");
            ps.setInt(2, 18);
            ps.setDouble(3, 76);
            ps.executeUpdate();
            System.out.println("data 2 Inserted ...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
