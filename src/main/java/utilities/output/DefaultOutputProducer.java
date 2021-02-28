package utilities.output;

/***
 *
 * Implementation of the OutputProducer
 * Simply receives next input line. Created for unit test purposes
 * @author Ignas Ivoska
 *
 */
public class DefaultOutputProducer implements OutputProducer {

    @Override
    public void produce(String output) {
        System.out.println(output);
    }

}
