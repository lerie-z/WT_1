package classes_and_objects.task12;

import classes_and_objects.task12.comparators.*;

import java.util.ArrayList;
import java.util.Comparator;

public class Main12 {
    public static void main(String[] args) {
        Book book1 = new Book("A", "Author", 13, 1);
        Book.setEdition(12);
        Book book2 = new Book("B", "SecondAuthor", 12, 2);

        System.out.println("Equals check:");
        System.out.println(book1.equals(book2));

        ProgrammerBook programmerBook1 = new ProgrammerBook("ProgrammerTitle", "ProgrammerAuthor", 1234, 3,"Belarusian", 2);
        ProgrammerBook programmerBook2 = new ProgrammerBook("ProgrammerTitle", "Author", 1234, 4, "Belarusian", 2);

        System.out.println("Equals check for programmer books:");
        System.out.println(programmerBook1.equals(programmerBook2));

        System.out.println("Clone check:");
        Book book3 = book1.clone();
        System.out.println(book3 == book1);
        System.out.println(book3.equals(book1));
        System.out.println(book1.compareTo(book2));

        ArrayList<Book> list = new ArrayList<Book>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        book3.setAuthor("ThirdAuthor");
        Comparator<Book> titleComparator = new TitleComparator();
        Comparator<Book> titleAuthorComparator = new TitleAuthorComparator();
        Comparator<Book> authorComparator = new AuthorComparator();
        Comparator<Book> authorTitlePriceComparator = new AuthorTitlePriceComparator();

        System.out.println("sort by title check:");
        list.sort(titleComparator);
        list.forEach( (s) -> System.out.println(s.toString()) );

        System.out.println("sort by title, author check:");
        list.sort(titleAuthorComparator);
        list.forEach( (s) -> System.out.println(s.toString()) );

        System.out.println("sort by author check:");
        list.sort(authorComparator);
        list.forEach( (s) -> System.out.println(s.toString()) );

        System.out.println("sort by author, title, price check:");
        list.sort(authorTitlePriceComparator);
        list.forEach( (s) -> System.out.println(s.toString()) );

        //and two more......
    }
}
