package constructors;

import javax.crypto.Mac;

//constructor is special method that runs everytime you create instance of class
class Machine {

    private String name;
    private int code;

    //name of constructor matches the name of the class
    //constructor used for initialization of variables
    //you can have multiple methods and constructors, as long as parameters are different
    //you can call constructors within other constructors
    public Machine() {
        //a call to a constructor needs to be the first line!
        this("Arnie", 0);

        System.out.println("Constructor running");
        name = "Arnie";
    }

    //constructor that receives a string parameter
    public Machine(String name) {
        this(name, 0);
        //this.name refers to instance variable
        //name refers to the local variable
        System.out.println("Second constructor running");
        this.name = name;

    }

    public Machine (String name, int code) {
        System.out.println("Third constructor running");
        this.name = name;
        this.code = code;

    }




}


public class App {

    public static void main(String[] args) {
        //created an instance of the machine class, new Machine (); new instance created, created object
        //a constructor that accepts no parameters
        Machine machine1 = new Machine();

        //only needed to create an object
        new Machine();
        Machine machine2 = new Machine("Bertie");
        Machine machine3 = new Machine("Chalky", 7);


    }
}
