package dao;

import java.util.List;

/***
 * A fake interface for the EntityManager
 * Used here to illustrate that the data layer (dao) calls something to communicate with the database, has no real implementation
 * @author Ignas Ivoska
 *
 */
public interface EntityManager {

    /**
     * Signature method that should save something
     * @param object the saving object
     * @return the saved object
     */
    Object persist(Object object);

    /**
     * Signature method that should find something
     * @return a list of found objects
     */
    List<Object> find();

}
