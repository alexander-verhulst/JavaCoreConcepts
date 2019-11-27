package upcastinganddowncasting;

import javax.naming.ldap.ManageReferralControl;

class Machine {

    public void start () {
        System.out.println("Machine started.");
    }

}

class Camera extends Machine {

    //override the method from machine
    public void start () {
        System.out.println("Camera started.");
    }

    public void snap () {
        System.out.println("Photo taken");
    }

}

public class App {

    public static void main(String[] args) {

        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();

        //upcasting. deals with object.
//        Machine machine2 = new Camera(); //polymorphism
        Machine machine2 = camera1; //same as above. Refers to camera object. We gone up the class hierarchy.
        machine2.start();

        //downcasting
        Machine machine3 = new Camera(); //Machine3 is referring to camera and camera can call snap method
        Camera camera2 = (Camera) machine3; //They want confirmation you know that you downcasting
        //downcasting has its risk
        camera2.start();
        camera2.snap();

    }


}
