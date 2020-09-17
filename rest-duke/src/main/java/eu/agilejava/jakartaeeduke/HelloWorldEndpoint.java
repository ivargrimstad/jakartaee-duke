package eu.agilejava.jakartaeeduke;


import jakarta.enterprise.context.RequestScoped;
import jakarta.validation.constraints.Email;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("hello")
@RequestScoped
public class HelloWorldEndpoint {

    private final String message = "Hello to Jakarta EE 9";
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response doGet(@Email @QueryParam("email") String email) {

        DukeSays response = new DukeSays(String.format("Duke says %s!", message), email);

        return Response.ok(response).build();
    }
}