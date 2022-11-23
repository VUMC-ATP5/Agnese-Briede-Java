package lekcijaTris.majasDarbs;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int[] skaitluMasivs =  new int[100];
        for (int v = 0; v < skaitluMasivs.length; v++) {
            skaitluMasivs[v] = v * 2;
            System.out.print(v*2);
        }

        System.out.println("New line");
        int[] myIntArray = IntStream.rangeClosed(0, 100).toArray();

        for (int j = 0; j < myIntArray.length; j++) {
            if (myIntArray[j] % 2 == 0) {
                System.out.print(myIntArray[j]);
            }
        }
    }

}
