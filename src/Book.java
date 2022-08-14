
public class Book {
	private String bookName;
	private String author;
	private String publisher;
	private int publishYear;
	
	public Book() {
		super();
	}
	
	public Book(String bookName, String author, String publisher, int publishYear) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.publishYear = publishYear;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}


	
}
