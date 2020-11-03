package required;

import org.springframework.beans.factory.annotation.Required;

public class Book {
	private String bookName;
	private int bookId;
	private String author;
	
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookId() {
		return bookId;
	}
	@Required
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void features() {
		System.out.println("Book Id ="+bookId);
		System.out.println("Book name ="+bookName);
		System.out.println("Author ="+author);
	}

}
