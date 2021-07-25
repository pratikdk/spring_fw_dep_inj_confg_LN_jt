package course.sf.sfg_dep_inj_confg.model;


import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello World";
    }

    @Override
    public String getSpanishGreeting() {
        return "Holla Mundo";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo Welt";
    }
}
