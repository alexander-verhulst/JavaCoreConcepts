package innerclass;

//can have multiple classes but can only have 1 public class


public class Robot {

    //create private field
    private int id;

    //non static classes, inner classes, nested classes
    //has access to instance data of robot class
    //good for logically grouping info. May have like heart class, leg class, etc

    //nested class type 1
    //need class to have access to the instance variables of the out class, ex. id
    private class Brain {
        //method
        public void think () {
            System.out.println("Robot " + id + " is thinking");
        }
    }

    //static class type 2
    //we can't refer to id unless we declare id as static
    //grouping classes together
    //just want a normal class that isn't associated with the outer class but want to group with outer class
   public static class Battery {
        public void charges () {
            System.out.println("Battery charging..");
        }
    }

    //create constructor
    public Robot(int id) {
        this.id = id;
    }

    //create method
    public void start() {
        System.out.println("Starting robot " + id);

        //pulled from inner class. We created an instance of the class
        Brain brain = new Brain();
        brain.think();

        //must be final
        final String name = "Rob";

        //local class type 3
        //classes created within methods. Has access to outer class variables and variables created in method
        class Temp {
            public void doSomething() {
                System.out.println("ID is: " + id);
                System.out.println("My name is " + name);
            }
        }
        //creating instance
        Temp temp = new Temp();
        temp.doSomething();

    }
}
