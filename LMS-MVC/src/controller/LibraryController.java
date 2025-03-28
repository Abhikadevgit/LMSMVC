package controller;

import model.Book;
import model.Student;
import service.LibraryService;
import view.LibraryView;

import java.util.Scanner;

public class LibraryController {
    private LibraryService libraryService;
    private LibraryView view;

    public LibraryController(LibraryService libraryService, LibraryView view) {
        this.libraryService = libraryService;
        this.view = view;
    }

    public void handleMenuOption(int option) {
        Scanner scanner = new Scanner(System.in);
        switch (option) {
            case 1: // Add Book
                Book book = view.getBookDetails();
                libraryService.addBook(book);
                System.out.println("Book added successfully!");
                break;
            case 2: // Remove Book
                book = view.getBookDetails();
                libraryService.removeBook(book);
                System.out.println("Book removed successfully!");
                break;
            case 3: // Add Student
                Student student = view.getStudentDetails();
                libraryService.addStudent(student);
                System.out.println("Student added successfully!");
                break;
            case 4: // Remove Student
                student = view.getStudentDetails();
                libraryService.removeStudent(student);
                System.out.println("Student removed successfully!");
                break;
            case 5: // Display Books
                libraryService.displayBooks();
                break;
            case 6: // Display Students
                libraryService.displayStudents();
                break;
            case 7: // Sort Books
                libraryService.getBookService().sortBooks();
                System.out.println("Books sorted!");
                break;
            case 8: // Search Book
                System.out.print("Enter Book ID to search: ");
                int id = scanner.nextInt();
                Book result = libraryService.getBookService().findBookById(id);
                if (result != null) {
                    System.out.println("Found: " + result);
                } else {
                    System.out.println("Book not found!");
                }
                break;
            case 9: // Exit
                System.exit(0);
        }
    }
}
