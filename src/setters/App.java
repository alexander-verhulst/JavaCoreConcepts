package setters;

class Frog {

    String name;
    int age;

    public void setName (String name) {
        //this refers to the instance variable up top!
        this.name = name;
    }


    public void setAge (int age) {
        //this refers to the instance variable up top
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge () {
        return age;
    }

    public void setInfo (String name, int age) {
       setName(name);
       setAge(age);
    }



}


public class App {

    public static void main(String[] args) {

        Frog frog1 = new Frog();

        //here you are setting a instance variable
        //would not be able to access if the variables in frog class were set to private!!
        frog1.name = "Bob";
        frog1.age = 2;

        //here you are calling a method
        frog1.setName("Bob");
        frog1.setAge(2);

        System.out.println(frog1.getName());

    }


}
