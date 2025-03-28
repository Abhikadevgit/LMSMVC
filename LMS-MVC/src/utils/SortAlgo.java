package utils;

import model.Book;
import java.util.ArrayList;

public class SortAlgo {

    // Updated quickSort method to work with ArrayList<Book>
    public static void quickSort(ArrayList<Book> books) {
        quickSort(books, 0, books.size() - 1);
    }

    // The actual sorting logic for ArrayList<Book>
    private static void quickSort(ArrayList<Book> books, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(books, low, high);
            quickSort(books, low, pivotIndex - 1);
            quickSort(books, pivotIndex + 1, high);
        }
    }

    // Partition method to sort the books based on their IDs
    private static int partition(ArrayList<Book> books, int low, int high) {
        int pivot = books.get(high).getId(); // Assuming Book has getId method
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (books.get(j).getId() <= pivot) {
                i++;
                // Swap the books
                Book temp = books.get(i);
                books.set(i, books.get(j));
                books.set(j, temp);
            }
        }

        // Swap the pivot element to its correct position
        Book temp = books.get(i + 1);
        books.set(i + 1, books.get(high));
        books.set(high, temp);

        return i + 1;
    }
}
