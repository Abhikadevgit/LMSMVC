package service;

import model.Book;

import java.util.ArrayList;

public interface BookService {
    void addBook(Book book);
    void removeBook(Book book);
    void sortBooks();
    Book findBookById(int id);
    ArrayList<Book> getBooks();
}
