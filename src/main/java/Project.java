import controller.author.AuthorController;
import controller.book.BookController;
import controller.entry.EntryController;
import entity.Author;
import entity.AuthorAlias;
import entity.AuthorBiography;
import entity.Book;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import repository.author.AuthorRepository;
import repository.book.BookRepository;
import service.AuthorService;
import service.BookService;
import utilities.input.DefaultInputReceiver;
import utilities.input.InputReceiver;
import utilities.output.DefaultOutputProducer;
import utilities.output.OutputProducer;

import javax.persistence.EntityManager;

/***
 *
 * Class which creates all the repositories, services and controllers and starts the entry controller
 * When using a dependency injection framework, this would not be needed.
 * Next example will be using a DI framework (for example Guice) to show what changes
 * @author Ignas Ivoska
 *
 */
public class Project {

    public static final String HIBERNATE_CONFIGURATION = "hibernate.cfg.xml";

    public Project() {
        constructEntryController(entityManager()).run();
    }

    private EntryController constructEntryController(EntityManager entityManager) {
        InputReceiver receiver = new DefaultInputReceiver();
        OutputProducer output = new DefaultOutputProducer();
        AuthorService authorService = new AuthorService(new AuthorRepository(entityManager));
        BookService bookService = new BookService(new BookRepository(entityManager), authorService);

        AuthorController authorController = new AuthorController(authorService, receiver, output);
        BookController bookController = new BookController(bookService, authorService, receiver, output);
        return new EntryController(authorController, bookController, receiver, output);
    }

    private EntityManager entityManager() {
        SessionFactory sessionFactory = new Configuration()
                .configure(HIBERNATE_CONFIGURATION)
                .addAnnotatedClass(Author.class)
                .addAnnotatedClass(Book.class)
                .addAnnotatedClass(AuthorBiography.class)
                .addAnnotatedClass(AuthorAlias.class)
                .buildSessionFactory();

        return sessionFactory.createEntityManager();
    }

}
