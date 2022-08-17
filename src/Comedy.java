import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Comedy extends Book implements Crud{
	private String funnyImages;
	List<Comedy> comedy = new ArrayList<>();	
	
	public Comedy() {
		super();
	}

	public Comedy(String bookName, String author, String publisher, int publishYear, String funnyImages) {
		super(bookName, author, publisher, publishYear);
		this.funnyImages = funnyImages;
	}

	public String getFunnyImages() {
		return funnyImages;
	}

	public void setFunnyImages(String funnyImages) {
		this.funnyImages = funnyImages;
	}
	@Override
	public void showAll() {
		String leftStringFormat = "|  %-11s  |  %-14s  |  %-16s  |  %-11d  |  %-14s  |%n";
		System.out.format("+---------------+------------------+--------------------+---------------+------------------+%n");
		System.out.println("|    Book       |     Author       |     Publisher      |  PublishYear  |    FunnyImages   |");
		System.out.format("+---------------+------------------+--------------------+---------------+------------------+%n");
		if(comedy.isEmpty()) {
			System.out.println("No book found.");
		} else {
			for(Comedy c : comedy) {
				System.out.format(leftStringFormat, c.getBookName(), c.getAuthor(), c.getPublisher(), c.getPublishYear(), c.getFunnyImages());
			}
		}
		System.out.format("+---------------+------------------+--------------------+---------------+------------------+%n");
	}
	@Override
	public void addBook() {
		boolean stay = true;
		do {
			Scanner sc= new Scanner(System.in);
			System.out.print("Book Name: ");
			setBookName(sc.nextLine());
			System.out.print("Book Author: ");
			setAuthor(sc.nextLine());
			System.out.print("Book Publisher: ");
			setPublisher(sc.nextLine());
			System.out.print("Book Funny Images: ");
			setFunnyImages(sc.nextLine());
			System.out.print("Book Publish Year: ");
			setPublishYear(sc.nextInt());
			System.out.println();
			comedy.add(new Comedy(getBookName(),getAuthor(),getPublisher(),getPublishYear(),getFunnyImages()));
			System.out.println("Book added");
			System.out.print("Do you want to add another book (Y/N)? ");
			Scanner s = new Scanner(System.in);
			char checkStay = s.next().trim().charAt(0);
			if(checkStay=='y' || checkStay=='Y') stay = true;
			if(checkStay=='n' || checkStay=='N') stay = false;
		}while(stay);
	}
	@Override
	public void updateBook() {
		if(comedy.isEmpty()) {
			System.out.format("+---------------+------------------+--------------------+---------------+------------------+%n");
			System.out.println("|    Book       |     Author       |     Publisher      |  PublishYear  |    FunnyImages   |");
			System.out.format("+---------------+------------------+--------------------+---------------+------------------+%n");
			System.out.println("No book to update.");
			System.out.format("+---------------+------------------+--------------------+---------------+------------------+%n");
		}else {
			String leftStringFormat = "|  %-11s  |  %-14s  |  %-16s  |  %-11d  |  %-14s  |%n";
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
			System.out.println("Update Funny Image: ");
			setFunnyImages(sc.nextLine());
			System.out.println("Update Publish Year: ");
			setPublishYear(sc.nextInt());
			comedy.set(index-1, new Comedy(getBookName(),getAuthor(),getPublisher(),getPublishYear(),getFunnyImages()));
			System.out.println("Book Updated");
			System.out.format("+---------------+------------------+--------------------+---------------+------------------+%n");
			System.out.println("|    Book       |     Author       |     Publisher      |  PublishYear  |    FunnyImages   |");
			System.out.format("+---------------+------------------+--------------------+---------------+------------------+%n");
			System.out.format(leftStringFormat, getBookName(), getAuthor(), getPublisher(), getPublishYear(), getFunnyImages());
			System.out.format("+---------------+------------------+--------------------+---------------+------------------+%n");
		}
	}
	@Override
	public void removeBook() {
		if(comedy.isEmpty()) {
			System.out.format("+---------------+------------------+--------------------+---------------+------------------+%n");
			System.out.println("|    Book       |     Author       |     Publisher      |  PublishYear  |    FunnyImages   |");
			System.out.format("+---------------+------------------+--------------------+---------------+------------------+%n");
			System.out.println("No book to remove.");
			System.out.format("+---------------+------------------+--------------------+---------------+------------------+%n");
		}else {
			Scanner sc= new Scanner(System.in);
			System.out.print("Index no of book to delete: ");
			int index = sc.nextInt()-1;
			comedy.remove(index);
			System.out.println("Book removed");
		}
	}
}
