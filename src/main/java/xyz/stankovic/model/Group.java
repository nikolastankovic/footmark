package xyz.stankovic.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

/**
 * Created by nikola on 12.12.16.
 */
@Data
@AllArgsConstructor
public class Group {

    private UUID id;
    private UUID user;
    private String name;
    private String description;

}
