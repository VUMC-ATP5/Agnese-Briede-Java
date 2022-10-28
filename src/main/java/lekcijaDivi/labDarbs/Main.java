package lekcijaDivi.labDarbs;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            int x = 3;
            int y = 2;
//seit buus true
            System.out.println(x > y);
            y = 3;
            //seit buus false
            System.out.println(x > y);
            //mazaaks
            x=5;
            y=3;
            System.out.println(x<y);
            y=10;
            System.out.println(x<y);

            //vienads

            System.out.println(x==y);
            System.out.println(5==5);

            String luksaforaKrasa = "green";
            System.out.println(luksaforaKrasa.equals("green"));
            System.out.println(luksaforaKrasa.equals("red"));

            //nav vienads
            System.out.println(x!=y);
            System.out.println(!luksaforaKrasa.equals("red"));

            //mazaks vienads
            x=5;
            y=6;
            int z=8;
            System.out.println(x<=y);

            int vecums =18;

            System.out.println(x<6 && z>y);
            System.out.println(x<6 || z>y);

            int age =18;
            boolean hasVoted = false;

            System.out.println("Passkaties cilveka pase");

            if(age>=18 && hasVoted ==false){
                System.out.println("Drikst balsot");
            }

            else {
                System.out.println("Nedriikst balsot");
            }

            //es aizeju un noabalsoju

            hasVoted=true;

            if(age>=18 && hasVoted ==false){
                System.out.println("Drikst balsot");
            }

            else {
                System.out.println("Nedriikst balsot");
            }

            //paarbaudiit vai skaitis ir negatiivs, ja ir, tad ievadiit tekstu - Negatiivs

            int skaitlis = -5;

            if(skaitlis>0){
                System.out.println("Pozitiivs");
            }
            else {
                System.out.println("Skaitis ir negatiivs");
            }

            String luksaforaKrasa2="green";

            if (luksaforaKrasa2.equals("green")){
                System.out.println("Ej");
            }
            else {
                System.out.println("Staavi");
            }

            System.out.println("Ievadiisim skaitli i");

            int i = 20;
            if (i ==10) {
                System.out.println("Skaitlis ir 10");
            }
            else if (i==15){

                System.out.println("Skatlis ir 15");

            } else if (i==20) {
                System.out.println("Skaitlis ir 20");
            }
            else {
                System.out.println("Skaitlis nav neviens no vajadziigajiem");
            }

            //zala gaisma, sarkana gaisma, dzeltena gaisma, nedeg neviena gaisma(skaties ziimes)

            //kods luksafors

            String trafficLight;
            System.out.println("Enter traffic light colour (green, yellow, red)");
            Scanner scanner = new Scanner(System.in);
            trafficLight = scanner.nextLine();

            if(trafficLight.equals("red")){
                System.out.println("Stay!");
            } else if (trafficLight.equals("yellow")) {
                System.out.println("Get ready!");
            } else if (trafficLight.equals("green")) {
                System.out.println("Go!");
            } else {
                System.out.println("Check signs!");
            }

            //noteikt vai skaitlis ir paara vai nepaara
            int number = scanner.nextInt();
            //te uzraksti kodu, kursh izvada vai skaitlis ir paara vai nepaara
            if (number % 2 == 0 ){
                System.out.println(number + "ir paara skaitlis");

            }else {
                System.out.println(number + "ir nepaara skaitlis");
            }
            int monthNumber = 4;

            switch (monthNumber){
                case 1: System.out.println("Janvaris");
                    break;
                case 2: System.out.println("Februaris");
                    break;
                case 3: System.out.println("Marts");
                    break;
                case 4: System.out.println("Aprilis");
                    break;
                default: System.out.println("Shaads menesis neeksistee");
            }
            String animal ="DOG";
            String result;
            switch (animal){
                case "DOG":
                case "CAT":
                    result="Domestic animal";
                    break;
                case "Tiger":
                    result="Wild animal";
                    break;
                default:
                    result="Unknown animal";
            }

            System.out.println("This animal is: " + result);

            int skaitlis1;
            System.out.println("Ievadi skaitli");
            skaitlis1= scanner.nextInt();

            if (skaitlis1>0) {
                System.out.println("Skaitlis ir liekaaks par nulli");
            } else if (skaitlis1==0){
                System.out.println("Skaitlis ir nulle");
            } else {
                System.out.println("Skaitlis ir mazaaks par nulli");
            }




//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Hello Lekcija 2");
//
//        int vecums;
//        System.out.println("Ka tevi sauc?");
//        String name= scanner.nextLine();
//        System.out.println("Labdien," + name + " Esi sveicinaats/a manaa programmaa");
//
//        System.out.println("Ievadi cilveka vecumu...");
//        vecums=scanner.nextInt();
//        if (vecums>=18){
//            System.out.println("Cilveks drikst balsot");
//        }
//        System.out.println("Programmas turpinaajums...");
//
//        System.out.println("Ievadi skaitli a");
//        int a= scanner.nextInt();
//        System.out.println("Ievadi skaitli b");
//        int b= scanner.nextInt();
//        int summa = a+b;
//        System.out.println("Skaitla a un b summa ir "+ summa);
            //System.out.println("Vai cilveks var balsot (kludais vecums) " + (vecums<18));
            //System.out.println("Vai cilveks var balsot "+(vecums>=18));



    }

}
