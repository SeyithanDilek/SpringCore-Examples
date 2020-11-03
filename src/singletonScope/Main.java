package singletonScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BookConfig.class);

		Book book1=ctx.getBean(Book.class);
		book1.setBookName("Alamut");
		System.out.println(book1.getBookName());
		
		Book book2=ctx.getBean(Book.class);
		System.out.println(book2.getBookName());
	}

}
