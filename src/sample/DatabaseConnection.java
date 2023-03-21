package sample;

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseConnection {

    public Connection databaseLink;

    public Connection getConnection() {
        String databaseName = "pocbase";
        String databaseUser = "root";
        String databasePassword = "miller888asz";
        String url = "jdbc:mysql://localhost:3306/" + databaseName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
            return  databaseLink;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}