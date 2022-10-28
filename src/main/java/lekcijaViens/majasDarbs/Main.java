package lekcijaViens.majasDarbs;

public class Main {
    public static void main(String[] args) {

        String countryName = "Sri Lanka";
        int population = 22156000;
        double area = 65610;
        String capital = "Colombo";
        String language1 = "Sinhala";
        String language2 = "Tamil";
        boolean isPartOfEU = false;
        char currency = 'R';

        System.out.println(countryName + " is an island country in South Asia.");
        System.out.println("Sri Lanka has a population of around 22 million, to be precise: " + population + ".");
        System.out.println("I have a friend who is from " + capital + " and he speaks mostly " + language1 + " and a little bit of " + language2 + ".");
        System.out.println("Since " + countryName + "is in Asia, its not part of EU.");
        System.out.println("In " + countryName + " they have ruupies and somethimes its defined as " + currency + "however usually it is LKR.");



        int a = 10;
        int b = 4;
        int c = 3;
        int rezultats;

        //ar +

        rezultats = a+b;
        System.out.println(rezultats);

        rezultats = a+b+c;
        System.out.println(rezultats);

        rezultats = a+c;
        System.out.println(rezultats);
        //ar -
        rezultats= a-b;
        System.out.println(rezultats);

        rezultats = a-c;
        System.out.println(rezultats);

        rezultats= a-c-b;
        System.out.println(rezultats);

        double x= 12;
        double y= 2.5;
        double z= 7;
        double summa;

        //ar *
        summa = x * y;
        System.out.println(summa);

        summa = x * y * x;
        System.out.println(summa);

        summa = x * z;
        System.out.println(summa);

        //ar /
        summa = x/y;
        System.out.println(summa);

        summa = x / y/z;
        System.out.println(summa);

        summa = y/z;
        System.out.println(summa);

        summa= x%y;
        System.out.println(summa);

        summa=x%z;
        System.out.println(summa);

        summa=z%y;
        System.out.println(summa);


    }
}
