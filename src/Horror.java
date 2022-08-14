import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Horror extends Book{
	private String genre;
	List<Horror> horrors = new ArrayList<>();
	public Horror() {
		super();
	}

	public Horror(String bookName, String author, String publisher, int publishYear, String genre) {
		super(bookName, author, publisher, publishYear);
		this.genre = genre;
	}

	public Horror(String genre) {
		super();
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	void showAll() {
		String leftStringFormat = "|  %-11s  |  %-14s  |  %-16s  |  %-11d  |  %-8s  |%n";
		System.out.format("+---------------+------------------+--------------------+---------------+------------+%n");
		System.out.println("|    Book       |     Author       |     Publisher      |  PublishYear  |    Genre   |");
		System.out.format("+---------------+------------------+--------------------+---------------+------------+%n");
		if(horrors.isEmpty()) {
			System.out.println("No book found.");
		} else {
			for(Horror h : horrors) {
				System.out.format(leftStringFormat, h.getBookName(), h.getAuthor(),h.getPublisher(), h.getPublishYear(), h.getGenre());
			}
		}
		System.out.format("+---------------+------------------+--------------------+---------------+------------+%n");
	}
	void addBook() {
		boolean stay = true;
		do {
			Scanner sc= new Scanner(System.in);
			System.out.print("Book Name: ");
			setBookName(sc.nextLine());
			System.out.print("Book Author: ");
			setAuthor(sc.nextLine());
			System.out.print("Book Publisher: ");
			setPublisher(sc.nextLine());
			System.out.print("Book Genre: ");
			setGenre(sc.nextLine());
			System.out.print("Book Publish Year: ");
			setPublishYear(sc.nextInt());
			System.out.println();
			horrors.add(new Horror(getBookName(),getAuthor(),getPublisher(),getPublishYear(),getGenre()));
			System.out.println("Book added");
			System.out.print("Do you want to add another book (Y/N)? ");
			Scanner s = new Scanner(System.in);
			char checkStay = s.next().trim().charAt(0);
			if(checkStay=='y' || checkStay=='Y') stay = true;
			if(checkStay=='n' || checkStay=='N') stay = false;
		}while(stay);
	}
	
	void updateBook() {
		if(horrors.isEmpty()) {
			System.out.format("+---------------+------------------+--------------------+---------------+------------+%n");
			System.out.println("|    Book       |     Author       |     Publisher      |  PublishYear  |    Genre   |");
			System.out.format("+---------------+------------------+--------------------+---------------+------------+%n");
			System.out.println("No book to update.");
			System.out.format("+---------------+------------------+--------------------+---------------+------------+%n");
		}else {
			String leftStringFormat = "|  %-11s  |  %-14s  |  %-16s  |  %-11d  |  %-8s  |%n";
			Scanner scObj= new Scanner(System.in);
			Scanner sc= new Scanner(System.in);
			System.out.println("Index No of Book to update: ");
			int index = scObj.nextInt();
			System.out.println("Update Book Name: ");
			setBookName(sc.nextLine());
			System.out.println("Update Author Name: ");
			setAuthor(sc.nextLine());
			System.out.println("Update Publisher Name: ");
			setPublisher(sc.nextLine());
			System.out.println("Update Genre Name: ");
			setGenre(sc.nextLine());
			System.out.println("Update Publish Year: ");
			setPublishYear(sc.nextInt());
			horrors.set(index-1, new Horror(getBookName(),getAuthor(),getPublisher(),getPublishYear(),getGenre()));
			System.out.println("Book Updated");
			System.out.format("+---------------+------------------+--------------------+---------------+------------+%n");
			System.out.println("|    Book       |     Author       |     Publisher      |  PublishYear  |    Genre   |");
			System.out.format("+---------------+------------------+--------------------+---------------+------------+%n");
			System.out.format(leftStringFormat, getBookName(), getAuthor(), getPublisher(), getPublishYear(), getGenre());
			System.out.format("+---------------+------------------+--------------------+---------------+------------+%n");
		}
	}
	void removeBook() {
		if(horrors.isEmpty()) {
			System.out.format("+---------------+------------------+--------------------+---------------+------------+%n");
			System.out.println("|    Book       |     Author       |     Publisher      |  PublishYear  |    Genre   |");
			System.out.format("+---------------+------------------+--------------------+---------------+------------+%n");
			System.out.println("No book to remove.");
			System.out.format("+---------------+------------------+--------------------+---------------+------------+%n");
		}else {
			Scanner sc= new Scanner(System.in);
			System.out.print("Index no of book to delete: ");
			int index = sc.nextInt()-1;
			horrors.remove(index);
			System.out.println("Book removed");
		}
	}
}
