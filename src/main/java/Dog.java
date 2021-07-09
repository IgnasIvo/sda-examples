/**
 * Dog class
 * This class has an empty constructor explicitly stated along with a secondary constructor
 * We can create a dog two ways now - by passing a name for him, or not.
 */
public class Dog {

	private String name;

	// our constructor that takes no parameters
	// here we will set the name to a predefined String
	public Dog() {
		this.name = "This damn dog has no name";
	}

	// our constructor with a parameter
	// here we will set the given name for the dog
	public Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
