package singleton;

/***
 *
 * @author Ignas Ivoska
 *
 */
public enum Database {
    INSTANCE;

    int executedQueries = 0;

    Database() {
        System.out.println("Database instance created in the enum");
    }

    public void executeQuery() {
        executedQueries++;
        System.out.println("A query has been executed");
    }

    public int getExecutedQueries() {
        return executedQueries;
    }

}
