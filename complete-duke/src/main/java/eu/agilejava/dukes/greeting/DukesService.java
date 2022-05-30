package eu.agilejava.dukes.greeting;


import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.time.LocalDate;

@Stateless
public class DukesService {

    @Inject
    private DukesRepository dukesRepository;

    public DukesGreetingRecord findGreeting() {

        return dukesRepository.findAll().stream()
                .findFirst()
                .map(g -> new DukesGreetingRecord(g.getMessage(), LocalDate.now()))
                .orElse(new DukesGreetingRecord("Hi!", LocalDate.now()));
    }
}
