package polymorphism;
//Means many shapes


public class App {


    public static void main(String[] args) {

        //Plant1 is reference pointing to Plant object
        Plant plant1 = new Plant();

        Tree tree = new Tree();

        //Polymorphism, using child class anywhere
        //Plant2 points to the reference plant1
        Plant plant2 = plant1;

        //Polymporphism
        Plant plant3 = tree;
        //references the tree object with tree method
        plant3.grow();

        tree.shedLeaves();
//        plant3.shedLeaves  Doesn't work because the first reference is Plant for plant3

        //can use child class
        doGrow(tree);


    }

    //Takes Plant argument type

    public static void doGrow (Plant plant) {
        //Can call plant methods
        plant.grow();
    }


}
