/**
 * FancyBox class
 * This class extends the Box class and has a constructor
 */
public class FancyBox extends Box {

	private String color;

	public FancyBox(String color) {
		// before executing line 12, the base object constructor is called. Since the base object has only the default constructor
		// it will do super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

}
