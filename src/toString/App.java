package toString;

class Frog {

    public String name;
    private int id;

    public Frog(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //important to define a to string method, or you'll get a hashcode Frog@3243243e5
    //Create string representation of your object
    @Override
    public String toString() {
        //return id + ": " + name;
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(": ").append(id);
        return sb.toString();
    }
}


public class App {

    public static void main(String[] args) {

        Object obj = new Object();

        Frog frog1 = new Frog("Bob", 7);
        Frog frog2 = new Frog("Sally", 3);
        System.out.println(frog1.toString());
        System.out.println(frog2.toString());



    }

}
