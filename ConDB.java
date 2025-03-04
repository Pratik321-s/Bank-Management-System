import java.sql.*;

public class ConDB {

    Connection connection;
    Statement statement;

    public ConDB(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankSystem", "root", "root");
            statement = connection.createStatement();
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
