package accesslevel2;

//subclass of plant

public class Oak extends Plant {

    public Oak () {
        //wont work because type is private in plant class
//        type = "tree";

        //can access because variable is protected in the parent class
        //Oak is subclass of plant
        this.size = "large";

        //no access specifier and works because oak and plant is same package
        this.height = 10;

    }


}
