package xyz.stankovic.resource;

import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("tag")
public class TagResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getIt() throws org.json.JSONException {

        JSONObject json = new JSONObject();

        json.put("Nikola", "Test");
        json.put("Sandra", "Test");

        return Response.status(200).entity(json.toString()).build();
    }
}
