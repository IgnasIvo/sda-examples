package singleton.shelf;

import java.util.ArrayList;
import java.util.List;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class BookShelf {
    private static final BookShelf INSTANCE = new BookShelf();

    private final List<String> books;

    private BookShelf() {
        System.out.println("A new bookshelf has been born");
        books = new ArrayList<>();
    }

    public static BookShelf getInstance() {
        return INSTANCE;
    }

    public void add(String book) {
        this.books.add(book);
    }

    public void remove(String book) {
        this.books.remove(book);
    }

    public List<String> getBooks() {
        return books;
    }

}
