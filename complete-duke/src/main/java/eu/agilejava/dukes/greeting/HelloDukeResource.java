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
    DukesRepository dukesRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public DukesGreeting sayHello() {

        DukesGreeting greeting = dukesRepository.findAll().stream()
                .findFirst()
                .orElse(new DukesGreeting("Hi!", "undefined"));

        return greeting;
    }
}
