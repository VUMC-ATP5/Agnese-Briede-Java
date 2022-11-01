package lekcijaDivi.majasDarbs;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWorkTwo {

    public static void main(String[] args) {

        //1. uzdevums

        int x;
        x = 10;

        //a piemers
        System.out.println(x > 0);

        //b piemers
        System.out.println(x < 0);

        //c piemers
        System.out.println(x > 5 && x <= 10);

        //d piemers
        x = 6;
        System.out.println(x > 5 || x != 5 && x < 10);

        //e piemers
        System.out.println(x == 0 || x == 10);

        //f piemers
        System.out.println(x * x > 10);


        //2. uzdevums
        System.out.println("Please enter calendar months number from 1-12: ");

        Scanner sc = new Scanner(System.in);
        int monthNumber = sc.nextInt();

        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("These is no such month in calendar with this type of number");

        }

        //3.uzdevums

        Scanner readInput = new Scanner(System.in);

        System.out.println("Please enter 3 whole numbers");
// Šis kods zemāk strādā tikai ar diviem numuriem, kas mājas darbā nederēja
//        int a = readInput.nextInt();
//        int b = readInput.nextInt();
//        int c = readInput.nextInt();
//

//
//        System.out.println("Highest number is " + Math.max(a,b));

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(readInput.nextInt());
        numbers.add(readInput.nextInt());
        numbers.add(readInput.nextInt());


        int currentHighest = 0;
        for (int currentNumber : numbers) {
            if (currentNumber > currentHighest) {
                currentHighest = currentNumber;
            }
        }
        System.out.println("The highest number is: " + currentHighest);

        //4. uzdevums

        String trafficLight;
        System.out.println("Please enter traffic light colour");
        Scanner scanner = new Scanner(System.in);
        trafficLight = scanner.nextLine();

        if (trafficLight.equals("red")) {
            System.out.println("STAY!");

        } else if (trafficLight.equals("yellow")) {
            System.out.println("GET READY!");

        } else if (trafficLight.equals("green")) {
            System.out.println("GO!");

        } else {
            System.out.println("CHECK SIGNS");
        }

        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

        printBussinesCard2("Agnese", "Briede", 25457833, 1993);
        printBussinesCard2("Agnese", "Briede", 25457833, 1993);
        printBussinesCard2("Agnese", "Briede", 25457833, 1993);

    }

    public static void printBusinessCard() {
        System.out.println("Business Card 1");
        System.out.println("###########");
        System.out.println("Name: Agnese");
        System.out.println("Last name: Briede");
        System.out.println("Phone number: 25457833");
        System.out.println("Birth year: 1993");
        System.out.println("###########");
    }

    public static void printBussinesCard2(String name, String lastName, int phoneNumber, int birthYear) {
        System.out.println("Business Card 2");
        System.out.println("###########");
        System.out.println("Name: " + name);
        System.out.println("Last name: " + lastName);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Birth year: " + birthYear);
        System.out.println("###########");
    }

}