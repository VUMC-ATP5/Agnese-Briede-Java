package lekcijaPieci.labDarbs;

public class Main {
    public static void main(String[] args) {
        Cat muris = new Cat();
        Dog reksis = new Dog();
        Cow govs = new Cow();
        Fish zivs = new Fish();
        muris.age = 3;
        muris.canClimbTrees = true;


        reksis.canClimbTrees = false;

        //paarrakstiishana-override

        muris.breathe();
        reksis.breathe();
        govs.breathe();
        zivs.breathe();

        govs.makeSound();
        muris.makeSound();
        reksis.makeSound();
        muris.eat();
        reksis.eat();
        muris.sharpenClaws();
        reksis.growl();

        muris.printClimbing();

        House house = new House(1, 2, 3, "Brivibas",
                2.5, 10000L, true);
        house.printHouse();

        house.setKadastralaVertiba(30000L);
        house.printHouse();
        house.setAdrese("Tallinas iela");

        Dog suns = new Dog();

        System.out.println("Majas adrese ir:" + house.getAdrese());

        System.out.println(Calculator.add(5, 10));
        System.out.println(Calculator.add(5.0, 10.0));
        System.out.println(Calculator.add(3,5,7));

    }
}
