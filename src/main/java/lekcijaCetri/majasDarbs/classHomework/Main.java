package lekcijaCetri.majasDarbs.classHomework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a,b,c,sp;
        double area;

        System.out.println("Enter value for sides of trinagle");
        Scanner r = new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        c=r.nextInt();

        sp=(a+b+c)/2;

        area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));

        Triangle t = new Triangle();
        System.out.println("");

        System.out.println("Area of triangle " + t.area);



    }
}
