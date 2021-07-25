package course.sf.sfg_dep_inj_confg.model;

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
