package anonymousclasses;

//Anonymous classes is a class that has it's own special method and does it's own thing like a method

class Machine {

    public void start() {

        System.out.println("Starting machine");

    }
}

interface Plant { //cannot instatiate interfaces
    public void grown();
}

public class App {

    public static void main(String[] args) {


        Machine machine1 = new Machine() { //anonymous class because it has custom method, one shot thing different
            //override methods here
            @Override public void start() {
                System.out.println("Camera snapping...");
            }
        };
        machine1.start();

        Plant plant1 = new Plant() {
            @Override
            public void grown() {
                System.out.println("Plant growing");
            }
        };
        plant1.grown();


    }

}
