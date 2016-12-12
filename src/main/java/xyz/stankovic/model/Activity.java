package xyz.stankovic.model;

import lombok.Data;
import org.joda.time.DateTime;

import java.util.UUID;

/**
 * Created by nikola on 12.12.16.
 */
@Data
public class Activity {

    private UUID id;
    private UUID trackingDomain;
    private UUID user;
    private String description;
    private DateTime start;
    private DateTime end;

}
