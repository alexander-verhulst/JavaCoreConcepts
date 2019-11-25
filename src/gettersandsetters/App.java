package gettersandsetters;

//Encapsulation mean the data is hidden


class Person {
    String name;
    int age;

    //void means the method doesn't return value
    void speak() {
        System.out.println("Hello my name is: " + name);
    }

    //method to calculate something
    //put int since you want to return an int
    int calculateYearsToRetire () {
        int yearsLeft = 65 - age;
        //System.out.println(yearsLeft);
        return yearsLeft;
    }

    int getAge() {
        return age;
    }

    String getName () {
        return name;
    }


}


public class App {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Joe";
        person1.age = 25;
        //person1.speak();
        person1.calculateYearsToRetire();

        //setting the variable to value of this method
        int years = person1.calculateYearsToRetire();
        System.out.println("Years until retirement: " + years);

        int age = person1.getAge();
        String name = person1.getName();

        System.out.println("Name is " + name);
        System.out.println("Age is " + age);

    }


}
