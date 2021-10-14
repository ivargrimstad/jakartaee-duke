package eu.agilejava.dukes.greeting;


import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class DukesService {

    @Inject
    private DukesRepository dukesRepository;

    public DukesGreetingRecord findGreeting() {

        return dukesRepository.findAll().stream()
                .findFirst()
                .map(g -> new DukesGreetingRecord(g.getMessage(), g.getEmail()))
                .orElse(new DukesGreetingRecord("Hi!", "undefined"));
    }
}
