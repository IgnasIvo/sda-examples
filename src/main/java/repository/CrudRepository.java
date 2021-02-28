package repository;

import java.util.List;

/***
 * Interface for repositories
 * @author Ignas Ivoska
 *
 */
public interface CrudRepository<T, ID> {
    T find(ID id);

    List<T> findAll();

    void save(T entity);

    void delete(T entity);
}
