package lekcijaPieci.labDarbs;

public class Cat extends Animal {

    public void makeSound(){
        System.out.println("mjau mjau mjau");
    }
    public void sharpenClaws(){
        System.out.println("I am sharpening my claws");
    }
    public void printClimbing(){
        System.out.println("Vai kaķis var kāpt kokos?" + canClimbTrees);
    }

}
