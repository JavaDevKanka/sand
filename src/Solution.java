import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class Solution {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connections connections = new Connections();
        Statement statement = connections.DbConnection().createStatement();
        ResultSet rs =  statement.executeQuery("select * from people");
        while (rs.next()) {
            System.out.println(rs.getString("age"));
        }
    }

}