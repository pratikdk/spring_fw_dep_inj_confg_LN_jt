package course.sf.sfg_dep_inj_confg;

import course.sf.sfg_dep_inj_confg.controller.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDepInjConfgApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDepInjConfgApplication.class, args);

		GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");

		System.out.println(greetingController.greet());
	}

}
