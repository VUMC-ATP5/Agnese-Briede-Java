package lekcijaPieci.labDarbs;

public class Dog extends Animal {

    private int legCount = 4;

    public void makeSound() {
        System.out.println("vau vau vau");
    }

    private void test123() {
        System.out.println("Private Method");
    }

    public int getLegCount() {
        return this.legCount;
    }

    public void setLegCount() {
        this.legCount = legCount;
    }

    public void growl() {
        System.out.println("RRRRRRRRRRRRR");
    }

}
