package lekcijaCetri.majasDarbs.papildusParKonstruktoriem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Shirt s = new Shirt("White",'M');

        System.out.println(s.color);
        System.out.println(s.size);

    }
}
