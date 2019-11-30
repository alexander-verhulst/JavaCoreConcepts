package abstractclasses;

public class App {

    public static void main(String[] args) {

        Camera cam1 = new Camera();
        cam1.setId(5); //because we set getter and setter in parent (Machine) class

        Car car1 = new Car();
        car1.setId(4);

        //no real value in this object because it is a base class, no such thing as a "Machine". Cars and
        //camera are the machines
     //   Machine machine1 = new Machine(); //made this class abstract so error appears

        car1.run();
        car1.doStuff();
        car1.start();
        car1.shutDown();


    }

}
