package eu.agilejava.dukes.greeting;


import eu.agilejava.dukes.annotation.Dukes;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Dukes(message = "Hi there!")
@Path("hello")
public class HelloDukeResource {

    @Inject
    private DukesService dukesService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public DukesGreetingRecord sayHello() {

        return dukesService.findGreeting();
    }
}
