package lekcijaViens.labDarbs;

public class Main {
    public static void main(String[] args) {

        //int - integer, satur veselu skaitlis
        int vecums = 34;
        System.out.println("Mans vecums ir: " + vecums);
        System.out.println(vecums);

        int garums = 180;
        System.out.println("Mans garums ir: " + garums);
        int kurpjuIzmers = 44;
        System.out.println("Mans kurpju izmers ir: " + kurpjuIzmers );
        int darbaStazs = 5;
        System.out.println("Mans darba stazs is: " + darbaStazs);
        int svars = 80;
        System.out.println("Mans svars ir: " + svars);

        int temperatura = -10;
        System.out.println("Ziemaa buus: " + temperatura);

        //pienem visu skaitli no -127 ldz + 127
        byte vecumsDivi = 99;

        short latvijasMazpilseta = 17000;

        long zivisOkeana = 215454512154L;

        float apavuIzmers = 44.5F;

        double grauduSvars = 150.3;

        //Sodien ir sestdiena, veilaks ir atverts
        boolean isSuperMarketOpen = true;
        //Turpretii skolas ir slegtas
        boolean isSchoolOpen = false;

        boolean isFebruaris = false;
        boolean isLeapYear = true;

        String sunaSkirne = "VAS";

        // Char definee vienaas peedinaas

        char valuta = '$';
        char atzime ='F';
        char dzimums = 'V';

        System.out.println("test" + valuta + atzime + dzimums);
        int a = 5;
        int b = 10;
        int summa;
        summa = a + b;
        System.out.println(summa);

        summa = a + a;
        System.out.println(summa);

        int x = 10;
        int y = -145;

        int rezultats = x+y;
        System.out.println(rezultats);

        rezultats = x-y;
        System.out.println(rezultats);

        rezultats = x * y;
        System.out.println(rezultats);

        rezultats = 10 / 2;
        System.out.println(rezultats);

        rezultats = 13 % 2;
        System.out.println(rezultats);







        String sunaVards = "Reksis";
        String teksts = "Suna vards ir: ";
        System.out.println(teksts + sunaVards);


    }
}
