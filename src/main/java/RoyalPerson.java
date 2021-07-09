/**
 * RoyalPerson class
 * This class is an extension of the Person class - since Person only has a parametrised constructor, the class REQUIRES
 * a constructor that would call the super(String name) (aka new Person(String name)) constructor.
 * We have to define the constructor here - even it if is without parameters
 */
public class RoyalPerson extends Person {

	// A constructor with no parameters, but it must call the super constructor which has a parameter
	public RoyalPerson() {
		super("Some guy the First");
	}

	// A constructor with one parameter which has to call the super constructor still
	public RoyalPerson(String name) {
		super(name + " the First");
	}

	// A constructor with two parameters, again, which calls the super constructor
	public RoyalPerson(String name, String title) {
		super(name + title);
	}

}
