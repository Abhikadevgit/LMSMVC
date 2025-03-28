package utils;

import model.Book;

import java.util.ArrayList;

public class Algo{
    public static Book binarySearch(ArrayList<Book> books, int id) {
        int left = 0;
        int right = books.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (books.get(mid).getId() == id) {
                return books.get(mid);
            } else if (books.get(mid).getId() < id) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Book not found
    }
}
