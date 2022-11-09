import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connections connections = new Connections();
        Statement statement = connections.DbConnection().createStatement();
        ResultSet rs =  statement.executeQuery("select * from people");
        List<String> stringList = new ArrayList<>();
        while (rs.next()) {
            stringList.add(rs.getString("age") + " " + rs.getString("name") + " " + rs.getString("email"));
        }

        stringList.stream()
                .filter(name -> name.contains("2"))
                .sorted(Comparator.comparing(ss -> ss.toLowerCase()))
                .forEach(System.out::println);

    }
}