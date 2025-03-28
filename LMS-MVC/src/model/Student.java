package model;

import java.util.LinkedList;

public class Student {
    private int id;
    private String name;
    private LinkedList<Book> borrowedBooks;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new LinkedList<>();
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    @Override
    public String toString() {
        return "Student[ID=" + id + ", Name=" + name + ", BorrowedBooks=" + borrowedBooks + "]";
    }
}
