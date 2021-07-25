package course.sf.sfg_dep_inj_confg.config;

import course.sf.sfg_dep_inj_confg.controller.GreetingController;
import course.sf.sfg_dep_inj_confg.model.GreetingRepository;
import course.sf.sfg_dep_inj_confg.model.GreetingRepositoryImpl;
import course.sf.sfg_dep_inj_confg.services.EnglishGreetingService;
import course.sf.sfg_dep_inj_confg.services.GermanGreetingService;
import course.sf.sfg_dep_inj_confg.services.GreetingService;
import course.sf.sfg_dep_inj_confg.services.SpanishGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingAppConfig {

    @Bean(name="greetingController")
    public GreetingController getGreetingController(GreetingService greetingService) {
        return new GreetingController(greetingService);
    }

    @Bean
    public GreetingRepository getGreetingRepository() {
        return new GreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean
    public GreetingService getEnglishGreetingService(GreetingRepository greetingRepository) {
        return new EnglishGreetingService(greetingRepository);
    }

    @Profile("GM")
    @Bean
    public GreetingService getGermanGreetingService(GreetingRepository greetingRepository) {
        return new GermanGreetingService(greetingRepository);
    }

    @Profile("ES")
    @Bean GreetingService getSpanishGreetingService(GreetingRepository greetingRepository) {
        return new SpanishGreetingService(greetingRepository);
    }
}
