package service;

import model.Book;
import model.Student;

import java.util.ArrayList;

public class LibraryServiceImpl implements LibraryService{

    private BookService bookService;
    private StudentService studentService;
    private ArrayList<Book> books;

    public LibraryServiceImpl(BookService bookService, StudentService studentService) {
        this.bookService = bookService;
        this.studentService = studentService;
    }

    @Override
    public void addBook(Book book) {
        bookService.addBook(book);
    }

    @Override
    public void removeBook(Book book) {
        bookService.removeBook(book);
    }

    @Override
    public void addStudent(Student student) {
        studentService.addStudent(student);
    }

    @Override
    public void removeStudent(Student student) {
        studentService.removeStudent(student);
    }

    @Override
    public void displayBooks() {
        for(Book book:bookService.getBooks()){}
    }

    @Override
    public void displayStudents() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println("ID: " + book.getId() + ", Name: " + book.getName() + ", Author: " + book.getAuthor());
            }
        }
    }

    @Override
    public BookService getBookService() {
        return bookService;
    }
}
