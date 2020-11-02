package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("resources/autowiring.xml");
		Book book=ctx.getBean("newBook",Book.class);
		book.setBookId(1);
		book.setBookName("Java Tutorials");
		System.out.println(book);
		
		
		
	}

}
