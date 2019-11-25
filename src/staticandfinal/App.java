package staticandfinal;

import java.awt.font.TextHitInfo;

class Thing {
    //member variables are usually private
    //final, cannot change the value
    //static so it is accessbed by calling class
    public final static int LUCKY_NUMBER = 7;
    public String name;
    //static, each member does NOT get its own copy. They belong to only one class. They are assoicated with the class
    //The class name is it's variable name
    public static String description;

    public static int count = 0;
    public int id;

    //counting the number of times and object is created
    public Thing ()  {
        //instance variable being assigned id by using the static count
        id = count;
        count++;
    }


    //public methods vs static methods
    //instance methods CAN access static variables
    public void showName() {
        System.out.println(" Object id:" + id + ", " + description + ": " + name);
    }

    //static method can access static data
    //static methods cannot access instance variables because it is created before
    public static void showInfo() {
        System.out.println("Hello");
        System.out.println(description);
    }

}

public class App {

    public static void main(String[] args) {

        System.out.println(" Before number count of objects: " +Thing.count);

        //Access the static
        Thing.description = "I am a thing";
        System.out.println(Thing.description);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        thing1.name = "Bob";
        thing2.name = "Sue";

        System.out.println(thing1.name);
        System.out.println(thing2.name);

        thing1.showName();
        thing2.showName();

        //static method by being accessed by calling the CLASS name.
        Thing.showInfo();;

        //accessing constant
        System.out.println(Math.PI);

        System.out.println(Thing.LUCKY_NUMBER);

        System.out.println("After number of creating object: " +Thing.count);



    }

}
