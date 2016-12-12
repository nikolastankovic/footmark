package xyz.stankovic.model;

import lombok.Data;

import java.util.UUID;

/**
 * Created by nikola on 12.12.16.
 */
@Data
public class User {

    private UUID id;
    private String email;
    private String firstname;
    private String lastname;
    private String password;

}
