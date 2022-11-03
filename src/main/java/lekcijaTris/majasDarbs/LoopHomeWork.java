package lekcijaTris.majasDarbs;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LoopHomeWork {
    public static void main(String[] args) {

        //1. uzdevums par veselajiem skatliem, kas apstaajas, kad summa paarsniedz 100
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        //te saakumaa izveeleejos (sum < 100), bet uzdevumaa teikts, kad paarsniedz 100, nu cerams, ka buus pareizi
        while (sum <= 100) {
            System.out.println("Ievadi skaitli zemāk");
            int number = scanner.nextInt();
            sum += number;
        }
        System.out.println("Gatavs");

        //par arrays 2. uzdevums, gan par int, gan string, gan char - char liidz galam nesapratu

        int[] numbers = {4, 6, 10, 12, 15};
        int i = 0;

        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }


        String[] names = {"Agnese", "Gunta", "Inese", "Janis", "Martins", "Matiss"};

        int currentIteration = 0;
        do {
            System.out.println(names[currentIteration]);
            currentIteration++;
        } while (currentIteration < names.length);


        System.out.println("forLoop");
        for (int j = 0; j < names.length; j++) {
            System.out.println(names[j]);
        }

        System.out.println("ForEach");
        for (String name : names) {
            System.out.println(name);
        }

        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g' };

        for (int j = 0; j < chars.length; j++) {
            System.out.println(chars[j]);
        }

        //3. uzdevums izdevaas izpildiit nosaciijumu, bet nesapratu vai tikai viena liinija jaaizprintee
        // vai visas 100 reizes, uzjautaaju pasniedzeejam par so
        // System.out.print - 1 līnija, System.out.println -
        // vairakas līnijas, jeb tik cik ir padots

        int[] myIntArray = IntStream.rangeClosed(0, 100).toArray();

        for (int j = 0; j < myIntArray.length; j++) {
            if (myIntArray[j] % 2 == 0) {
                System.out.print(Arrays.toString(myIntArray));
            }
        }
        //4. uzdevums par fakoriaalu

        System.out.println("Home work about factorial");
        int fact = 1;
        int number = 10;
        for (int j = 1; j <= number; j++) {
            fact *= j;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }

    //saīsinājumi vētību Java Assignment Operators
    public static void calculations() {
        int result = 0;
        //To add(+)
        result += 1; // is the same as result = result + 1
        result *= 1; // is the same as result = result * 1
        result -= 1; // is the same as result = result -1

    }


}




