package eu.agilejava.dukes.greeting;


import jakarta.enterprise.context.RequestScoped;

import java.time.LocalDate;

@RequestScoped
public class DukesService {


    public DukesGreetingRecord findGreeting() {
        return new DukesGreetingRecord("Howdy, Core Duke", LocalDate.now());
    }
}
