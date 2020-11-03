package required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("resources/required.xml");
		Book myBook=ctx.getBean("myBook",Book.class);
		myBook.features();
	}

}
