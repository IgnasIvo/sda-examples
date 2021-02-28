package repository.author;

import entity.Author;
import repository.AbstractRepository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/***
 * Repository that works with the Author entity
 * @author Ignas Ivoska
 *
 */
public class AuthorRepository extends AbstractRepository<Author, Long> {

    public AuthorRepository(EntityManager entityManager) {
        super(entityManager, Author.class);
    }

    /**
     * Implementation of the find all method
     * @return all authors
     */
    @Override
    public List<Author> findAll() {
        return entityManager.createQuery("FROM Author", Author.class).getResultList();
    }

    /**
     * Method to search by first name or last name fragment
     * @param fragment fragment which we search by
     * @return found authors that match the criteria
     */
    public List<Author> searchByNameFragment(String fragment) {
        Query query = entityManager.createQuery("FROM Author WHERE firstName LIKE :nameFragment" +
                " OR lastName LIKE :nameFragment", Author.class);
        query.setParameter("nameFragment", "%" + fragment + "%");
        return query.getResultList();
    }

}
