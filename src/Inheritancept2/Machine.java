package Inheritancept2;

public class Machine {

    //can only be accessed within this class since it is private variable
    protected String name = "Machine Type 1";

    public void start() {
        System.out.println("Machine started");
    }

    public void stop() {
        System.out.println("Machine stopped");
    }


}
