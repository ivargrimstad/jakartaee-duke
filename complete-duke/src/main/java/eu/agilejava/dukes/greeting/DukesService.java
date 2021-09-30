package eu.agilejava.dukes.greeting;


import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class DukesService {

    @Inject
    private DukesRepository dukesRepository;

    public DukesGreeting findGreeting() {

        return dukesRepository.findAll().stream()
                .findFirst()
                .orElse(new DukesGreeting("Hi!", "undefined"));
    }
}
