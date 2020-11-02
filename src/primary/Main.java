package primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		Customer customer = ctx.getBean(Customer.class);
		customer.usageArea();
	}

}
