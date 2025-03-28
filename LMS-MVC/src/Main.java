import controller.LibraryController;
import service.*;
import view.LibraryView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize Services
        BookService bookService = new BookServiceImpl();
        StudentService studentService = new StudentServiceImpl();
        LibraryService libraryService = new LibraryServiceImpl(bookService, studentService);
        LibraryView view = new LibraryView();
        LibraryController controller = new LibraryController(libraryService, view);

        // Main Loop
        while (true) {
            view.displayMenu();
            System.out.print("Choose an option: ");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            controller.handleMenuOption(option);
        }
    }
}
