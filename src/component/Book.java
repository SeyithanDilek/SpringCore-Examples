package component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bookBean")
public class Book {
	@Autowired
	private Author author;
	public void test() {
		author.authorInfo();
		System.out.println("testing this call methods");
	}

}
