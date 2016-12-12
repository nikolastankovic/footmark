package xyz.stankovic.logic;

import xyz.stankovic.model.User;

import javax.inject.Inject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

/**
 * Created by nikola on 12.12.16.
 */
public class UserBean {

    @Inject
    private Connection con;

    public void createUser(User user) {

        user.setId(UUID.randomUUID());

        String statement = "insert into user (user_id, email, firstname, lastname, password) values (?, ?, ?, ?, ?) ";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement(statement);

            preparedStatement.setString(1, user.getId().toString());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getFirstname());
            preparedStatement.setString(4, user.getLastname());
            preparedStatement.setString(5, user.getPassword());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
