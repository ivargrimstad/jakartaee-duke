package eu.agilejava.dukes.greeting;


import eu.agilejava.dukes.annotation.Dukes;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
