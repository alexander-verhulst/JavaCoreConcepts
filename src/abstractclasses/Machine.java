package abstractclasses;


//base class
//abstract means you can't call this class in the main
//making strong statement what
public abstract class Machine {

    //common things for all child classes can be inserted in the parent class
    private int id;

    //getter and setter made so that every class that extends this class has id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //since all machines need to start you can create an abstract method for all child classes
    //making methods abstract forces the child classes to implement them
    //similar to interfaces
    public abstract void start (); //format for abstract methods, no brackets

    public abstract void doStuff();

    public abstract void shutDown();

    public void run () {
        start();
        doStuff();
        shutDown();
    }


}
