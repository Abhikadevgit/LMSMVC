package service;

import model.Book;
import model.Student;

public interface LibraryService {
    void addBook(Book book);
    void removeBook(Book book);
    void addStudent(Student student);
    void removeStudent(Student student);
    void displayBooks();
    void displayStudents();
    BookService getBookService();
}
