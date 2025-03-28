package service;

import model.Book;
import utils.Algo;
import utils.SortAlgo;

import java.util.ArrayList;

public class BookServiceImpl implements BookService {
    private ArrayList<Book> books;

    public BookServiceImpl() {
        this.books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public void sortBooks() {
        SortAlgo.quickSort(books); // Ensure this method works properly
    }

    @Override
    public Book findBookById(int id) {
        return Algo.binarySearch(books, id); // Ensure this method works properly
    }

    // Display all books added to the library
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println("ID: " + book.getId() + ", Name: " + book.getName() + ", Author: " + book.getAuthor());
            }
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
