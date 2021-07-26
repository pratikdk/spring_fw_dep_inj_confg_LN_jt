package course.sf.sfg_dep_inj_confg.services;

import course.sf.sfg_dep_inj_confg.model.GreetingRepository;

public class GreetingServiceFactory {
    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String serviceLang) {
        switch (serviceLang) {
            case "gm":
                return new GermanGreetingService(greetingRepository);
            case "es":
                return new SpanishGreetingService(greetingRepository);
            default:
                return new EnglishGreetingService(greetingRepository);
        }
    }
}
