package accesslevel2;

public class Plant {

    //Bad practice to make public, want to encapsulate
    //Any class access public
    public String name;

    //UPPERCASE is constant
    //acceptable practice since final
    public final static int ID = 8;

    //prevent people from outside class to access
    //private can only access from THIS class
    private String type;

    //Variables that can be accessed in child classes and this class
    protected String size;

    //no access modifier
    //package level visibility
    int height;


    public Plant() {
        this.name = "Fred";

        this.size = "medium";
        //can access because same class

        this.type = "plant";

        this.height = 8;

    }
}
