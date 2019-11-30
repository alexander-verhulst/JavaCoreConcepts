package equalsmethod;

import java.util.Objects;

class Person {
    //create fields
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override //generate hascode and equals
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class App {

    public static void main(String[] args) {

        Person person1 = new Person(5,"Bob");
        Person person2 = new Person(8, "Sue");

        //are they equal or not
        System.out.println(person1 == person2); //outputs false

        Person person3 = new Person(1, "Dick");
        Person person4 = new Person(1, "Dick");
        System.out.println(person3.equals(person4)); //will say false unless we override it and define ourselves
        //in class above
        //we clicked generate, hashcode and equals and it changed output to true


        Double value1 = 7.2;
        Double value2 = 7.2;

        System.out.println(value1 == value2); //outputs false
        System.out.println(value1.equals(value2)); //outputs true

        Integer number1 = 6;
        Integer number2 = 6;
        System.out.println(number1 == number2); //outputs true

        String text1 = "Hello";
        String text2 = "Hello";
        System.out.println(text1 == text2); //outputs true, but not right, use the .equals
        System.out.println(text1.equals(text2)); //better

        //dont compare non primitive numbers with ==, only use it when to references
        // == is comparing if you have the same literal object
        //.equals if you want to compare the same meaning



    }

}
