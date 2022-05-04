package eu.agilejava.dukes.greeting;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDate;

@Path("hello")
public class HelloDukeResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public DukesGreetingRecord sayHello() {
        return new DukesGreetingRecord("Howdy Jakarta Jakarta RESTful Web Services SE Bootstrap", LocalDate.now());
    }
}
