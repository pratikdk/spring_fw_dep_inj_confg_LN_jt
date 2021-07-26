package course.sf.sfg_dep_inj_confg.config;

import course.sf.sfg_dep_inj_confg.controller.GreetingController;
import course.sf.sfg_dep_inj_confg.model.GreetingRepository;
import course.sf.sfg_dep_inj_confg.model.GreetingRepositoryImpl;
import course.sf.sfg_dep_inj_confg.services.GreetingService;
import course.sf.sfg_dep_inj_confg.services.GreetingServiceFactory;
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
    public GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    public GreetingRepository getGreetingRepository() {
        return new GreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean
    public GreetingService getEnglishGreetingService(GreetingServiceFactory greetingServiceFactory) {
        //return new EnglishGreetingService(greetingRepository);
        return greetingServiceFactory.createGreetingService("en");
    }

    @Profile("GM")
    @Bean
    public GreetingService getGermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
        //return new GermanGreetingService(greetingRepository);
        return greetingServiceFactory.createGreetingService("gm");
    }

    @Profile("ES")
    @Bean GreetingService getSpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
        //return new SpanishGreetingService(greetingRepository);
        return greetingServiceFactory.createGreetingService("es");
    }
}
