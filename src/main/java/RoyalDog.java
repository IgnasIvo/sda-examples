/**
 * RoyalDog class
 * This class is an extension of the Dog class which has two constructors - one without parameters, one with parameters
 * We do not need a default constructor here as the class will have an empty constructor generated.
 * If written down, it would look like this:
 * public RoyalDog() {
 *    	super(); <- this super part is not written by default, it is interpreted and added, as we first need the parent
 * }
 */
public class RoyalDog extends Dog {

	private String title;

	// a constructor with a parameter
	// it does not need to add super(), as there is an empty constructor defined
	public RoyalDog(String title) {
		this.title = title;
	}

	// a constructor with two parameters
	// we want the dog to have a name (aka new Dog(String name)), so we call super(name) here
	// it calls the parent constructor with parameters
	public RoyalDog(String name, String title) {
		super(name);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

}
