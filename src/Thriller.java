import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Thriller extends Book implements Crud{
	private String voilence;
	List<Thriller> thrillers = new ArrayList<>();
	public Thriller() {
		super();
	}

	public Thriller(String bookName, String author, String publisher, int publishYear, String voilence) {
		super(bookName, author, publisher, publishYear);
		this.voilence = voilence;
	}
	
	public String getVoilence() {
		return voilence;
	}

	public void setVoilence(String voilence) {
		this.voilence = voilence;
	}
	@Override
	public void showAll() {
		String leftStringFormat = "|  %-11s  |  %-14s  |  %-16s  |  %-11d  |  %-11s  |%n";
		System.out.format("+---------------+------------------+--------------------+---------------+---------------+%n");
		System.out.println("|    Book       |     Author       |     Publisher      |  PublishYear  |    Voilence   |");
		System.out.format("+---------------+------------------+--------------------+---------------+---------------+%n");
		if(thrillers.isEmpty()) {
			System.out.println("No book found.");
		} else {
			for(Thriller t : thrillers) {
				System.out.format(leftStringFormat, t.getBookName(), t.getAuthor(),t.getPublisher(), t.getPublishYear(), t.getVoilence());
			}
		}
		System.out.format("+---------------+------------------+--------------------+---------------+---------------+%n");
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
			System.out.print("Book Voilence: ");
			setVoilence(sc.nextLine());
			System.out.print("Book Publish Year: ");
			setPublishYear(sc.nextInt());
			System.out.println();
			thrillers.add(new Thriller(getBookName(),getAuthor(),getPublisher(),getPublishYear(),getVoilence()));
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
		if(thrillers.isEmpty()) {
			System.out.format("+---------------+------------------+--------------------+---------------+---------------+%n");
			System.out.println("|    Book       |     Author       |     Publisher      |  PublishYear  |    Voilence   |");
			System.out.format("+---------------+------------------+--------------------+---------------+---------------+%n");
			System.out.println("No book to update.");
			System.out.format("+---------------+------------------+--------------------+---------------+---------------+%n");
		}else {
			String leftStringFormat = "|  %-11s  |  %-14s  |  %-16s  |  %-11d  |  %-11s  |%n";
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
			System.out.println("Update Voilence: ");
			setVoilence(sc.nextLine());
			System.out.println("Update Publish Year: ");
			setPublishYear(sc.nextInt());
			thrillers.set(index-1, new Thriller(getBookName(),getAuthor(),getPublisher(),getPublishYear(),getVoilence()));
			System.out.println("Book Updated");
			System.out.format("+---------------+------------------+--------------------+---------------+---------------+%n");
			System.out.println("|    Book       |     Author       |     Publisher      |  PublishYear  |    Voilence   |");
			System.out.format("+---------------+------------------+--------------------+---------------+---------------+%n");
			System.out.format(leftStringFormat, getBookName(), getAuthor(), getPublisher(), getPublishYear(), getVoilence());
			System.out.format("+---------------+------------------+--------------------+---------------+---------------+%n");
		}
	}
	@Override
	public void removeBook() {
		if(thrillers.isEmpty()) {
			System.out.format("+---------------+------------------+--------------------+---------------+---------------+%n");
			System.out.println("|    Book       |     Author       |     Publisher      |  PublishYear  |    Voilence   |");
			System.out.format("+---------------+------------------+--------------------+---------------+---------------+%n");
			System.out.println("No book to remove.");
			System.out.format("+---------------+------------------+--------------------+---------------+---------------+%n");
		}else {
			Scanner sc= new Scanner(System.in);
			System.out.print("Index no of book to delete: ");
			int index = sc.nextInt()-1;
			thrillers.remove(index);
			System.out.println("Book removed");
		}
	}
}
