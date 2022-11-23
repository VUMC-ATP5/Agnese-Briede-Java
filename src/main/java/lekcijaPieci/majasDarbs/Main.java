package lekcijaPieci.majasDarbs;
public class Main {

    public static void main(String[] args) {

        Cylinder cylinder1 = new Cylinder();
        cylinder1.setHeight(19);
        cylinder1.setRadius(3);
        System.out.println("Volume of the first cylinder is: " + cylinder1.calculateVolume());
        System.out.println("and Surface Area:" + cylinder1.calculateSurfaceArea());

        System.out.println("");

        Cylinder cylinder2 = new Cylinder(15, 3);
        System.out.println("Volume of the second cylinder is: " + cylinder2.calculateVolume());
        System.out.println("and Surface Area:" + cylinder2.calculateSurfaceArea());
    }

}
