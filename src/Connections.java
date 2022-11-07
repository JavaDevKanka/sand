import java.lang.reflect.InvocationTargetException;
import java.sql.DriverManager;
import java.sql.SQLException;

class Connections {
    public java.sql.Connection DbConnection() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/people";
        String username = "root";
        String password = "Rikimarolox123";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, username, password);
    }
}
