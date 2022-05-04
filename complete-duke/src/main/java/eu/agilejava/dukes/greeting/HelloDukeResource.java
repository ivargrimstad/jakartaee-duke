package eu.agilejava.dukes.greeting;


import eu.agilejava.dukes.annotation.Dukes;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Dukes(message = "Hi there!")
@Path("hello")
public class HelloDukeResource {

    @EJB
    private DukesService dukesService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public DukesGreeting sayHello() {
        return dukesService.findGreeting();
    }
}
