package classes_and_objects.task12.comparators;

import classes_and_objects.task12.Book;

import java.util.Comparator;

public class TitleAuthorComparator implements Comparator<Book> {

    private final Comparator<Book> comparator;

    public TitleAuthorComparator() {
        this.comparator = new  TitleComparator().thenComparing(new  AuthorComparator());
    }

    @Override
    public int compare(Book book1, Book book2) {
        return comparator.compare(book1, book2);
    }
}
