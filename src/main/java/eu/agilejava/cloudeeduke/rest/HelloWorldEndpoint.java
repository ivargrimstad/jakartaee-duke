package eu.agilejava.cloudeeduke.rest;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.metrics.annotation.Metered;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.validation.constraints.Email;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("hello")
@RequestScoped
public class HelloWorldEndpoint {

    @Inject
    @ConfigProperty(name = "message", defaultValue = "Hello")
    private String message;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Metered
    public Response doGet(@Email @QueryParam("email") String email) {

        DukeSays response = new DukeSays(String.format("Duke says %s!", message), email);

        return Response.ok(response).build();
    }
}