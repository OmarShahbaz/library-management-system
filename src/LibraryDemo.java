import java.util.Scanner;
public class LibraryDemo {
	
	public static void main(String args[]) {
		Crud crudHorror = new Horror();
		Crud crudComedy = new Comedy();
		Crud crudThriller = new Thriller();
		String[] genre = new String[3];
		boolean stay = true;
		genre[0] = "Horror";
		genre[1] = "Comedy";
		genre[2] = "Thriller";
		int choice;
		do {
			do {
				String leftAlignFormat = "| %-2d | %-8s |%n";
				System.out.println("Books Library");
				System.out.format("+----+----------+%n");
				System.out.format("| ID |	Genre	|%n");
				System.out.format("+----+----------+%n");
				for (int i = 0; i < 3; i++) {
				    System.out.format(leftAlignFormat, i+1, genre[i]);
				}
				System.out.format("+----+----------+%n");
				System.out.print("Choose one: ");
				Scanner obj = new Scanner(System.in);
				choice = obj.nextInt();
			}while(choice<1 || choice>3);
			System.out.println();
			
			switch(choice) {
			
			case 1://operations
				do {
					String[] operationsHorror = {"Add Book", "Update Book", "Remove Book","View Books"};
					String leftAlignFormat = "| %-5d | %-12s |%n";
					System.out.format("+-------+--------------+%n");
					System.out.format("|  ID   |  Operations  |%n");
					System.out.format("+-------+--------------+%n");
					for (int i = 0; i < 4; i++) {
					    System.out.format(leftAlignFormat, i+1, operationsHorror[i]);
					}
					System.out.format("+-------+--------------+%n");
					System.out.print("Choose Operation: ");
					
					Scanner obj = new Scanner(System.in);
					int selection = obj.nextInt();
					switch(selection) {//horror
					case 1://add
						crudHorror.addBook();
						break;
					case 2://update
						crudHorror.updateBook();
						break;
					case 3://remove
						crudHorror.removeBook();
						break;
					case 4://view
						crudHorror.showAll();
						break;
					}
					System.out.println("Do you want to perform more actions on Horror Genre (Y/N)?");
					Scanner sc = new Scanner(System.in);
					char checkStay = sc.next().trim().charAt(0);
					if(checkStay=='y' || checkStay=='Y') stay = true;
					if(checkStay=='n' || checkStay=='N') stay = false;
				}while(stay);
				break;
			case 2://comedy
				do {
					String[] operationComedy = {"Add Book", "Update Book", "Remove Book","View Books"};
					String leftAlignFormatComedy = "| %-5d | %-12s |%n";
					System.out.format("+-------+--------------+%n");
					System.out.format("|  ID   |  Operations  |%n");
					System.out.format("+-------+--------------+%n");
					for (int i = 0; i < 4; i++) {
					    System.out.format(leftAlignFormatComedy, i+1, operationComedy[i]);
					}
					System.out.format("+-------+--------------+%n");
					System.out.print("Choose Operation: ");
					
					Scanner objComedy = new Scanner(System.in);
					int selectionComedy = objComedy.nextInt();
					switch(selectionComedy) {//comedy
					case 1://add
						crudComedy.addBook();
						break;
					case 2://update
						crudComedy.updateBook();
						break;
					case 3://remove
						crudComedy.removeBook();
						break;
					case 4://view
						crudComedy.showAll();
						break;
					}
					System.out.println("Do you want to perform more actions on Comedy Genre (Y/N)?");
					Scanner sc = new Scanner(System.in);
					char checkStay = sc.next().trim().charAt(0);
					if(checkStay=='y' || checkStay=='Y') stay = true;
					if(checkStay=='n' || checkStay=='N') stay = false;
				}while(stay);
				break;
			case 3://thriller
				do {
					String[] operationThriller = {"Add Book", "Update Book", "Remove Book", "View Books"};
					String leftAlignFormatThriller = "| %-5d | %-12s |%n";
					System.out.format("+-------+--------------+%n");
					System.out.format("|  ID   |  Operations  |%n");
					System.out.format("+-------+--------------+%n");
					for (int i = 0; i < 4; i++) {
					    System.out.format(leftAlignFormatThriller, i+1, operationThriller[i]);
					}
					System.out.format("+-------+--------------+%n");
					System.out.print("Choose Operation: ");
					
					Scanner objThriller = new Scanner(System.in);
					int selectionThriller = objThriller.nextInt();
					switch(selectionThriller) {//comedy
					case 1://add
						crudThriller.addBook();
						break;
					case 2://update
						crudThriller.updateBook();
						break;
					case 3://remove
						crudThriller.removeBook();
						break;
					case 4://view
						crudThriller.showAll();
						break;
					}
					System.out.println("Do you want to perform more actions on Thriller Genre (Y/N)?");
					Scanner sc = new Scanner(System.in);
					char checkStay = sc.next().trim().charAt(0);
					if(checkStay=='y' || checkStay=='Y') stay = true;
					if(checkStay=='n' || checkStay=='N') stay = false;
				}while(stay);
			}
			System.out.println("Do you want to continue with the program?(Y/N)");
			Scanner sc = new Scanner(System.in);
			char checkStay = sc.next().trim().charAt(0);
			if(checkStay=='y' || checkStay=='Y') stay = true;
			if(checkStay=='n' || checkStay=='N') stay = false;
		}while(stay);
		System.out.println("Program ends.");
	}
		
}
