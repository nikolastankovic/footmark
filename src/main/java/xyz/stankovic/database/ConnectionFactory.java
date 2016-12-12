package xyz.stankovic.database;

import javax.enterprise.inject.Produces;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by nikola on 12.12.16.
 */
public class ConnectionFactory {

    static Connection connection = null;

    @Produces
    public final Connection getConnection() {

        if(connection == null){

            Connection con = null;

            try {

                Class.forName("com.mysql.jdbc.Driver");
                // Setup the connection with the DB
                con = DriverManager
                        .getConnection("jdbc:mysql://localhost/footmark?"
                                + "user=root&password=b8c447aa82");

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            connection = con;
        }

        return connection;
    }
}
