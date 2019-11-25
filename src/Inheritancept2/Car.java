package Inheritancept2;

//Car is a child class of a machine
//Car is a machine
//Car inherits from machine
public class Car extends Machine{



    //header should be same if you want to override a method
//    public void start() {
//        System.out.println("Car started");
//    }


    public void wipeWindShield() {
        System.out.println("Wiping windshield");
    }

    public void showInfo() {
        System.out.println("Car name: " + name);
    }

    @Override
    public void start() {
        System.out.println("Car started");
    }
}
