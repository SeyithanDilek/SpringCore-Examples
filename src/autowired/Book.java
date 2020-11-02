package autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Book {
	private int bookId;
	private String bookName;
	private Category category;
	
	public void features() {
		System.out.println( "Category : "+category.getCategoryName() + " No of Category : " +category.getNumberOfCategory());
		System.out.println( "Book : "+bookName+ " No of Category : " +bookId);
	
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Category getCategory() {
		return category;
	}
	
	@Autowired
	@Qualifier("Life")
	public void setCategory(Category category) {
		System.out.println("Setter method calling Category");
		this.category = category;
	}

}
