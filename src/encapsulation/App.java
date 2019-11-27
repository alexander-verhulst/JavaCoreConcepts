package encapsulation;

//rules: make everything PRIVATE
//if needs to be accessed by child class make it PROTECTED
//end user uses PUBLIC
//Don't make data public except constants

class Plant {
    //instance variables
    //encapsulate the inner workings of the class and expose public API (public methods...)
    private String name;
    //class variable since it is static
    public static final int ID = 7;

    //method just used by class itself
    public String getData () {
        String data = "Some stuff" + calculateGrowthForecast();
        return data;
    }

    //just used within the class
    private int calculateGrowthForecast() {
        return 9;
    }



    //methods like getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



} //end of class


public class App {

    public static void main(String[] args) {

    }


}
