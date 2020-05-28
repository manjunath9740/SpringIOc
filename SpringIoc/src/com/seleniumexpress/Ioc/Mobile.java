

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	    System.out.println("Config loaded");
	    Airtel air = (Airtel)context.getBean("airtel");
	    air.calling();
	    air.data();
	    Vodafone voda=context.getBean("voda",Vodafone.class);
	    voda.calling();
	    voda.data();
	    Sim sim = context.getBean("sim",Sim.class);
	    sim.calling();
	    sim.data();
    }
}
