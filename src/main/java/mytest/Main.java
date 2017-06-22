package mytest;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Андрей on 21.06.2017.
 */
public class Main {
    public static final String URL = "jdbc:mysql://localhost:3306/test?useSSL=false\",\"root\",\"root";
    public static final String USER = "root";
    public static final String PASSWORD = "root";

    public static void main(String[] args) {
        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false\",\"root\",\"root");
            if(!connection.isClosed()){
                System.out.println("Connection completed!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Registration faild");
        }
    }
}
