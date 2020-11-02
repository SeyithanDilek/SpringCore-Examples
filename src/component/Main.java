package component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx=new AnnotationConfigApplicationContext(BookConfig.class);
		Book book= ctx.getBean("bookBean",Book.class);
		System.out.println("The book object created by : "+book);
		book.test();
		
	}

}
