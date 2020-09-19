package eu.agilejava.dukes;


import javax.enterprise.context.RequestScoped;
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

    private final String message = "Hello to Jakarta EE 9";
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response doGet(@Email @QueryParam("email") String email) {

        DukeSays response = new DukeSays(String.format("Duke says %s!", message), email);

        return Response.ok(response).build();
    }
}