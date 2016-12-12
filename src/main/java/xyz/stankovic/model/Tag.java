package xyz.stankovic.model;

import lombok.Data;

import java.util.UUID;

/**
 * Created by nikola on 12.12.16.
 */
@Data
public class Tag {

    private UUID id;
    private UUID user;
    private String name;

}
