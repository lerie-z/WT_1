package classes_and_objects.task12.comparators;

import java.util.Comparator;
import classes_and_objects.task12.Book;

public class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getAuthor().compareTo(book2.getAuthor());
    }

}
