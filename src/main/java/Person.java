/**
 * Person class
 * This class has a constructor with required arguments
 * Since we added a constructor for this class, the default one is erased - we cannot do new Person()
 * If we want to be able to do it, we have to explicitly add an empty constructor
 */
public class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
