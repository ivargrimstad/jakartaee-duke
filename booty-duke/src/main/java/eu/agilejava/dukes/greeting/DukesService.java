package eu.agilejava.dukes.greeting;


import jakarta.enterprise.context.ApplicationScoped;

import java.time.LocalDate;

@ApplicationScoped
public class DukesService {

    public DukesGreetingRecord sayHello() {
        return new DukesGreetingRecord("Howdy Jakarta RESTful Web Services SE Bootstrap", LocalDate.now());
    }
}
