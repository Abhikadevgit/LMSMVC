package view;
import model.Book;
import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryView {
    public void displayMenu() {
        System.out.println("Welcome to the Library Management System");
        System.out.println("1. Add Book");
        System.out.println("2. Remove Book");
        System.out.println("3. Add Student");
        System.out.println("4. Remove Student");
        System.out.println("5. Display Books");
        System.out.println("6. Display Students");
        System.out.println("7. Sort Books");
        System.out.println("8. Search Book");
        System.out.println("9. Exit");
    }

    public void displayBooks(ArrayList<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void displayStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Book getBookDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Book Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine();
        return new Book(id, name, author);
    }

    public Student getStudentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        return new Student(id, name);
    }
}
