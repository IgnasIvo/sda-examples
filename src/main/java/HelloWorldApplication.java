/***
 *
 * @author Ignas Ivoska
 *
 */
public class HelloWorldApplication {

    public static void main(String[] args) {
    	Box box = new Box();
    	Orange orange = new Orange();
    	Person person = new Person("Michael Jordan");
    	Dog strayDog = new Dog();
    	Dog dog = new Dog("Scooby");
    	FancyBox fancyBox = new FancyBox("orange");
    	RoyalDog royalDog = new RoyalDog("the great");
    	RoyalDog superRoyalDog = new RoyalDog("Snowball", "first of his name");
    	RoyalPerson randomDude = new RoyalPerson();
    	RoyalPerson firstOfHisName = new RoyalPerson("Jeff");
    	RoyalPerson someGreatKing = new RoyalPerson("Jeremy", "King of the penguins");
    }

}
