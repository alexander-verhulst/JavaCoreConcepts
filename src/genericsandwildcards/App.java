package genericsandwildcards;

import javax.crypto.Mac;
import java.util.ArrayList;

class Machine {

    @Override
    public String toString() {
        return "I am a Machine";
    }

    public void start() {
        System.out.println("Machine starting.");
    }

}

class Camera extends Machine {

    @Override
    public String toString() {
        return "I am a camera";
    }
}

public class App {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");

        showList(list);

        ArrayList<Machine> list1 = new ArrayList<>();
        list1.add(new Machine());
        list1.add(new Machine());

        showMachineList(list1);

        ArrayList <Camera> list2 = new ArrayList<>();
        list2.add(new Camera());
        list2.add(new Camera());

        //array list of any parameter child class is not a subclass of the parent class
        showMachineList1(list2);

    }

    //how to pass your array list through a method
    public static void showList(ArrayList<String> list) { //static because we don't have obj of class app
        for (String value: list) {
            System.out.println(value);
        }
    }

    public static void showMachineList(ArrayList<Machine> list1) {
        for (Machine value : list1) {
            System.out.println(value);
        }
    }

    public static void showMachineList1(ArrayList<? extends Machine> list1) { //? is a wildcard to accept anything
        for (Object value : list1) {
            System.out.println(value);
        }
    }

}
