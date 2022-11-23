package lekcijaCetri.majasDarbs.papildusParKonstruktoriem;

public class Shirt {

    public static String color;
    public static char size;

    Shirt() {

    }

    Shirt(String newColor, char newSize) {
        color = newColor;
        size = newSize;
    }

    public static void putOn() {
        System.out.println("Shirt is on!");
    }

    public void takeOff() {
        System.out.println("Shirt is off!");
    }

    public void setColour(String newColor) {
        color = newColor;
    }

    public void setSize(char newSize) {
        size = newSize;
    }


}
