package course.sf.sfg_dep_inj_confg.services;

import course.sf.sfg_dep_inj_confg.model.GreetingRepository;

public class GermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public GermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
