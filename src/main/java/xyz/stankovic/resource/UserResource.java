package xyz.stankovic.resource;

import org.json.JSONException;
import org.json.JSONObject;
import xyz.stankovic.logic.UserBean;
import xyz.stankovic.model.User;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("user")
public class UserResource {

    @Inject
    private UserBean userBean;

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUser() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("Nikola", "Test");
        json.put("Sandra", "Test");

        return Response.status(200).entity(json.toString()).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createUser(User user) {

        userBean.createUser(user);

        String message = "User successfully created.";
        return Response.status(200).entity(message).build();
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteUser() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("Nikola", "Test");
        json.put("Sandra", "Test");

        return Response.status(200).entity(json.toString()).build();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response updateUser() throws JSONException {

        JSONObject json = new JSONObject();

        json.put("Nikola", "Test");
        json.put("Sandra", "Test");

        return Response.status(200).entity(json.toString()).build();
    }

}
