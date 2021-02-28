package service;

import entity.Author;
import repository.author.AuthorRepository;

import java.util.List;

/***
 * The service for author related functionality
 * @author Ignas Ivoska
 *
 */
public class AuthorService {

    private final AuthorRepository authorRepository;

    /**
     * Constructor for the service
     * @param authorRepository Repository that works with the author entity
     */
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    /**
     * Method that creates a new author with required parameters
     * @param firstName author's first name
     * @param lastName author's last name
     * @return saved author
     */
    public Author saveNewAuthor(String firstName, String lastName) {
        Author author = new Author(firstName, lastName);
        authorRepository.save(author);
        return author;
    }

    /**
     * Method that finds all authors
     * @return all authors
     */
    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    /**
     * Method that updates an author
     * @param author the author we update
     * @return updated author
     */
    public Author updateAuthor(Author author) {
        authorRepository.save(author);
        return author;
    }

    /**
     * Method that finds the author by the name fragment
     * @param fragment fragment which we search by
     * @return list of found authors
     */
    public List<Author> findAuthorsByNameFragment(String fragment) {
        return authorRepository.searchByNameFragment(fragment);
    }
}
