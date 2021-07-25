package course.sf.sfg_dep_inj_confg.services;

import course.sf.sfg_dep_inj_confg.model.GreetingRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("German")
@Service()
public class GermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public GermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
