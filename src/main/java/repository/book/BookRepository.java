package repository.book;

import entity.Book;
import repository.AbstractRepository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/***
 * Repository that works with the book entity
 * @author Ignas Ivoska
 *
 */
public class BookRepository extends AbstractRepository<Book, Long> {

    public BookRepository(EntityManager entityManager) {
        super(entityManager, Book.class);
    }

    /**
     * Implementation of the findAll method
     * @return all books
     */
    @Override
    public List<Book> findAll() {
        return entityManager.createQuery("FROM Book", Book.class).getResultList();
    }

    /**
     * Method to search by name fragment
     * @param fragment fragment to search by
     * @return books that match the criteria
     */
    public List<Book> searchByNameFragment(String fragment) {
        Query query = entityManager.createQuery("FROM Book WHERE name LIKE :nameFragment", Book.class);
        query.setParameter("nameFragment", "%" + fragment + "%");
        return query.getResultList();
    }

}
