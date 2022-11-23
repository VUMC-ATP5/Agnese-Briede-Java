package lekcijaCetri.majasDarbs.classHomework;

public class Main {

    public static void main(String[] args) {


        Triangle t1 = new Triangle();
        t1.a = 19;
        t1.b = 23;
        t1.c = 2;

        System.out.println("Area of the first triangle is " + t1.calculateArea());

        System.out.println("");

        Triangle t3 = new Triangle(1, 2, 5);
        System.out.println("Area of the second triangle " + t3.calculateArea());


    }
}
