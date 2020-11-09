package eu.agilejava.dukes;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@DukesAnnotation(dukeMessage = "Hi there!")
@Path("hello")
public class HelloDukeResource {

    @Inject
    DukesRepository dukesRepository;

    @GET
    @Produces(APPLICATION_JSON)
    public DukesGreeting sayHello() {

        DukesGreeting greeting = dukesRepository.findAll().stream()
                .findFirst()
                .orElse(new DukesGreeting("Hi!", "undefined"));

        return greeting;
    }
}
