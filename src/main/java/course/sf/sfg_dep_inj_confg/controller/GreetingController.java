package course.sf.sfg_dep_inj_confg.controller;

import course.sf.sfg_dep_inj_confg.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet() {
        return greetingService.sayGreeting();
    }
}
