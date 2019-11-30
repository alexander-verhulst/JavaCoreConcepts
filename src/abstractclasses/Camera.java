package abstractclasses;

public class Camera extends Machine {


    //created abstract method in the parent class and got an error here
    //had to implement methods
    @Override
    public void start() {
        System.out.println("Camera starting...");
    }

    @Override
    public void doStuff() {
        System.out.println("Camera doing stuff");

    }

    @Override
    public void shutDown() {
        System.out.println("Camera shutting down");
    }
}
