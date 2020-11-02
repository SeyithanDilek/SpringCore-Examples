package autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("resources/autowired.xml");
		Book book=ctx.getBean("Alamut",Book.class);
		book.setBookId(1);
		book.setBookName("Alamut");
		book.features();
		
		
		
		
	}

}
