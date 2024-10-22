package bonus;
import java.util.* ; 
public class LibraryActions {
	public void addBookToLibrary(Library library, Scanner scanner) {
        System.out.println("Enter the name of the book to add:");
        String bookName = scanner.nextLine();
        library.addNewBook(new Book(bookName));
    }

    public void borrowBookFromLibrary(Library library, Scanner scanner) {
        System.out.println("Enter your name:");
        String readerName = scanner.nextLine();
        System.out.println("Enter the name of the book to borrow:");
        String bookName = scanner.nextLine();
        library.takeBook(bookName, readerName);
    }

    public void returnBookToLibrary(Library library, Scanner scanner) {
        System.out.println("Enter the name of the book to return:");
        String bookName = scanner.nextLine();
        library.getBackBook(bookName);
    }

    public void checkBookInLibrary(Library library, Scanner scanner) {
        System.out.println("Enter the name of the book to check:");
        String bookName = scanner.nextLine();
        library.findBook(bookName);
    }
}

