import java.sql.*;

public class Solution02 {
    public static void main(String[] args) throws SQLException {

        try (Connection connection = DriverManager.
                getConnection("jdbc:mysql://localhost/sql_task?user=root&password=abc123")) {
            String query ="INSERT INTO employee (empcode, empname, empage, esalary) VALUES "
                    + "(101, 'Jenny', 25, 10000), "
                    + "(102, 'Jacky', 30, 20000), "
                    + "(103, 'Joe', 20, 40000), "
                    + "(104, 'John', 40, 80000), "
                    + "(105, 'Shameer', 25, 90000);";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println(rowsAffected + " rows inserted.");
        }
    }
}

