package classes_and_objects.task12.comparators;

import classes_and_objects.task12.Book;

import java.util.Comparator;

public class AuthorTitlePriceComparator implements Comparator<Book> {

    private final Comparator<Book> comparator;

    public AuthorTitlePriceComparator() {
        this.comparator = new  AuthorTitleComparator().thenComparing(new PriceComparator());
    }

    @Override
    public int compare(Book book1, Book book2) {
        return comparator.compare(book1, book2);
    }
}
