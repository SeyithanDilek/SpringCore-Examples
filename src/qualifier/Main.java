package qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(HeroConfig.class);
		Costume costume= (Costume) ctx.getBean("batCostume");
		costume.wearing();
	}
}
