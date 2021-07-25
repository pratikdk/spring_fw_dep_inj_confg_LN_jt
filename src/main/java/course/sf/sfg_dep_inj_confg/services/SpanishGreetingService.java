package course.sf.sfg_dep_inj_confg.services;

import course.sf.sfg_dep_inj_confg.model.GreetingRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Spanish")
@Service()
public class SpanishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public SpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }


    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
