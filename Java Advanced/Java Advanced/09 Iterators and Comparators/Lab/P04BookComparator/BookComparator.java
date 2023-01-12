package J09IteratorsAndComparators.Lab.P04BookComparator;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        if (firstBook.getTitle().compareTo(secondBook.getTitle()) == 0) {
            return Integer.compare(firstBook.getYear(), secondBook.getYear());
        }
        return firstBook.getTitle().compareTo(secondBook.getTitle());
    }
}
