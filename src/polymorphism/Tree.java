package polymorphism;

//Subclass of Plant Class
public class Tree extends Plant {

    //override grow method in plant
    @Override
    public void grow() {
        System.out.println("Tree growing");
    }

    public void shedLeaves () {
        System.out.println("Leaves shedding");
    }

}
