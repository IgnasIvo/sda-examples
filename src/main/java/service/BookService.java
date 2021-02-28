package service;

import entity.Author;
import entity.Book;
import repository.book.BookRepository;

import java.util.List;
import java.util.Set;

/***
 * Service that works with book related functionality
 * @author Ignas Ivoska
 *
 */
public class BookService {

    private final BookRepository bookRepository;
    private final AuthorService authorService;

    /**
     * Constructor for the service
     * @param bookRepository Repository which works with book entities
     * @param authorService Service which has some author functionality that is needed here
     */
    public BookService(BookRepository bookRepository,
                       AuthorService authorService) {
        this.bookRepository = bookRepository;
        this.authorService = authorService;
    }

    /**
     * Method to save new a new book with required parameters
     * @param name Name of the book
     * @param authors Set of book's authors
     * @return saved book
     */
    public Book saveNewBook(String name, Set<Author> authors) {
        Book book = new Book(name, authors);
        bookRepository.save(book);
        addBookToAuthors(authors, book);
        return book;
    }

    /**
     * Method to find all books
     * @return all books
     */
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    /**
     * Method to find a book by it's name fragment
     * @param fragment fragment which we search by
     * @return all books that match this criteria
     */
    public List<Book> searchByNameFragment(String fragment) {
        return bookRepository.searchByNameFragment(fragment);
    }

    /**
     * Method which updates the authors with a new book
     * @param authors Authors that wrote the book
     * @param book the book that they wrote
     */
    private void addBookToAuthors(Set<Author> authors, Book book) {
        authors.forEach(author -> {
            author.getBooks().add(book);
            authorService.updateAuthor(author);
        });
    }

}
