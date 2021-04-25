package factory;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class TrainStation {

    public static void doSomething() {
        Transport trainOne = (Transport) FactoryProvider.getFactory("transport").create("train");
        System.out.println(trainOne.toString() + " arrives at the station");

        Transport trainTwo = (Transport) FactoryProvider.getFactory("transport").create("train");
        System.out.println(trainTwo.toString() + " arrives at the station");

        Transport oldTrain = (Transport) FactoryProvider.getFactory("transport").create("OLD_TRAIN");
        System.out.println(oldTrain.toString() + " arrives at the station");
    }

}
