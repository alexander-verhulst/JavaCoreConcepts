package accesslevel;

//Private == only within same class
//Public == from anywhere
//Protected == same class, subclass, same package
//No modifier == same package only


import accesslevel2.Plant;

//public class means its visible from outside the file
//cannot declare classes private
public class App {

    public static void main(String[] args) {

        Plant plant = new Plant();

        System.out.println(plant.name);

        //Can access but cannot change it
        System.out.println(plant.ID);

//        Type is private so you cannot access it
//        System.out.println(plant.type);


        //Classes no longer in this package so it won't work
//        System.out.println(plant.size);


    }

}
