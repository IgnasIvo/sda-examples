package example.one;

/***
 *
 * @author Ignas Ivoska
 *
 */
public /* <- This is an access modifier */ class /* <- this keyword defines that this file is a CLASS */ Food { /* <- This is the class name. It must be the same as the file name
                                                                                                                      and should always use CamelCase (e.g. Food, Car, VolkswagenGolf */
    /*
        This is a class attribute (also known as a field).
        A simple term would be a class variable
        It is written in this structure, parts in () are optional.
        <access modifier> <type> <name> (= <value>)
        Best practice is to keep class fields as private, which means they cannot be accessed from outside of the object.
        This is to keep objects in "self-control".
        An example of this would be a can of beer.

        Lets say we bought a can of beer. But until we bring it back, we only see the can - how do we know we purchased a full can of actual beer.
        We need to know what is inside the can and how much does it have (and ideally, be able to make it have less contents inside in the near future)
        But it's a can. The liquid (the field) cannot be accessed by us directly, without interacting with the can and opening it.
        This is called encapsulation.

     */
    private String name;

    /*
        This is a constructor - this is the way we allow to construct objects of this class (type)
        they have access modifiers and parameters
        in our case, a food must have some kind of a name, therefore it is required in the constructor
     */
    public Food(String name) {
        this.name = name;
    }

    /*
        We open the can. Thats how we get the can's private liquid from the outside, and that is the design of the can to provide it to us.
     */
    public String getName() {
        return name;
    }

    /*
        And if we have time, we can update the can to have no more beer inside :)
     */
    public void setName(String name) {
        this.name = name;
    }

}
