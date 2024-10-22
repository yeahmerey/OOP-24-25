package bonus;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryActions actions = new LibraryActions();

        Scanner sc = new Scanner(System.in);

        String input;
        while (true) {
            System.out.println("Actions: 'a' - add, 'b' - borrow, 'r' - return, 'c' - check, 'e' - exit");
            input = sc.nextLine().toLowerCase();

            if (input.equals("a")) {
                actions.addBookToLibrary(library, sc);
            } else if (input.equals("b")) {
                actions.borrowBookFromLibrary(library, sc);
            } else if (input.equals("r")) {
                actions.returnBookToLibrary(library, sc);
            } else if (input.equals("c")) {
                actions.checkBookInLibrary(library, sc);
            } else if (input.equals("e")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Please try again, command is unknown.");
            }
        }
        sc.close();
    }
}
