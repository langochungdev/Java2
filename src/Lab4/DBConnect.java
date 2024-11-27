package Lab4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public static final String HOSTNAME = "localhost";
    public static final String PORT = "1433";
    public static final String DBNAME = "LAB4JAVA";
    public static final String USERNAME = "sa";
    public static final String PASSWORD = "0000";

    public static Connection getConnection() {
        String Url = "jdbc:sqlserver://"+ HOSTNAME+ ":"+ PORT+ ";databaseName="+ DBNAME;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(Url, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Kết nối thất bại: " + e.getMessage());
        }
        return null;
    }
}
