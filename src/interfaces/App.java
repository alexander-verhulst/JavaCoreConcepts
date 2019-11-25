package interfaces;

public class App  {

    public static void main(String[] args) {

        //2 objects with nothing in common
        Machine mach1 = new Machine();
        mach1.start();// method we defined for machine

        Person person1 = new Person("Bob");
        person1.greet();

        //create a method for both of these objects even tho they unrelated
        //Create a interface both both of these methods

        //Machine does implement this interface
        Info info1 = new Machine();
        info1.showInfo();


        Info info2 = person1;
        info2.showInfo();

        //call the method
        outputInfo(mach1);
        outputInfo(person1);



    }

    private static void outputInfo(Info info) {
        info.showInfo();
    }


}
