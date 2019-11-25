package inheritance;

import Inheritancept2.Car;
import Inheritancept2.Machine;

public class App {

    public static void main(String[] args) {

        Machine mach1 = new Machine();
        mach1.start();
        mach1.stop();
        System.out.println();

        System.out.println("Car Object");
        Car car1 = new Car();
        car1.start();
        car1.wipeWindShield();
        car1.stop();

    }
}
