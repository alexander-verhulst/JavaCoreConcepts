package classesandoop;
//can only have 1 public class in java file but many classes
//class is object for blueprint
//not a particular person but a representation of a person
class Person {
    //classes can contain :
        //1. Data (Instance variables)
        //2. Subroutine (Methods), behavior
    //Data, instance variables, or state
    String name;
    int age;

    //create a subroutine that will allow the person to say their name (behavior), inside of the person class
    void speak() {
        System.out.println("Hello my name is: " + name + " and I am " + age + " years old ");
        for (int i = 0; i < 3; i++ ) {
            System.out.println("I like turtles! ");
        }
    }

    void sayHello() {
        System.out.println("Hello there!");
    }



}

public class Application {

    //This is a subroutine part of Application class, subroutine == method
    public static void main(String[] args) {

        //Use can use person class to create person object
        Person person1 = new Person();
        person1.name = "Joe Bloggs";
        person1.age = 37;
        System.out.println(person1.name);
        //method name always needs parantheses
       //This is "envoking" a method
        person1.speak();
        person1.sayHello();
        System.out.println();

        //another person object
        //Person = Type of variable
        //Person2 = name of variable
        // new Person (); new person object
        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;
        person2.speak();
        person2.sayHello();
        System.out.println();


        System.out.println("Fruit Class");
        RedFruit fruit1 = new RedFruit("Bannana", "Yellow");
        System.out.println(fruit1);




    }

}
