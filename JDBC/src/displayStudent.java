import java.sql.*;

public class displayStudent {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password = "krn@mysql1";

    public static void main(String[] args) throws SQLException {
        String query = "SELECT * FROM STUDENT";
        Connection con = null;
        try{
            con = DriverManager.getConnection(url,username, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("<<<<< Printing Student Data >>>>");
            System.out.println("------------------------");
            System.out.println("ID | Name | Age | Marks ");
            while(rs.next()){
                System.out.println("------------------------");
                System.out.println(rs.getInt("ID")+" | "+
                        rs.getString("NAME")+" | "+
                        rs.getInt("AGE")+" | "+
                        rs.getDouble("MARKS")+" | ");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        finally {
            con.close();
        }
    }
}
