package lekcijaTris.labDarbs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Saakaas programma");
        printCard2("Peteris ","Lakis","Seda",35);
        printCard();
        printNewLine();
        printCard();
        System.out.println("Beidzaas programma");
        int laukums = calculateArea(2,5);
        System.out.println("Taisnstura laukums ir " + laukums);
        System.out.println(avarage(3.6,3.9,8));

        int[] monthlyCosts = {100, 40, 23, 44, 55, 200};
        String[] produktuSaraksts = {"piens", "maize", "olas"};

        String[]cars={"Volvo","BMW","Nissan","Mercedes"};
        System.out.println("Masiva garums ir: "+ cars.length);

        cars[1]= "Audi";

        String[] studentuSaraksts = new String[23];
        studentuSaraksts[0]="Janis Berzins";
        studentuSaraksts[1]="Juris Kreilis";

        System.out.println(studentuSaraksts[0]);
        System.out.println(studentuSaraksts[1]);
        System.out.println(studentuSaraksts[2]);
        macamiesParMasiviem();
        whileCikls();

    }

    public static void whileCikls(){

        int x=5;
        while (x>0){
            System.out.println("X nav nulle, X = " +x);
            x = x-1;
        }

        int i=10;
        while (i<50){
            System.out.println("I ir " + i);
            i++; //tas pats kas i = i +1;

        }
        String[] cars = {"Volvo", "BMW", "Nissan", "Mercedes"};
        int z =0;
        String visiAuto=null;
        while (z<4){
            System.out.println(cars[z]);
            visiAuto=visiAuto + cars[z];
            z=z+1;
        }
        System.out.println("kods turpinas");

        //uzdevums - izprintēt visus skaitlus no menesa tēriņi masīva uz ekrāna
        int[] menesaTerini = {100, 40, 23, -44, 55, 200};
        int k =0;
        while (k<5){
            System.out.println(menesaTerini[k]);
            k++;
        }

        Scanner ievade = new Scanner(System.in);
        System.out.println("Ievadi skaitli");
        int number = ievade.nextInt();
        int summa =0;

        while (number>0){
            summa = summa +number;
            System.out.println("Ievadi Skaitli..");
            number = ievade.nextInt();
        }
        System.out.println("summa ir: "+ summa);

        String[] kartis = {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};
        int m =0;
        while (m<kartis.length){
            System.out.println("Kartis ir" + kartis[m]);
            m++;
        }


        int q=1;
        do{
            System.out.println("Test Test Test");
            q++;
        }while (q<10);
        Scanner scanner=new Scanner(System.in);
        String parole = "SuperSecretPassword123";
        String ievaditaParole;
        do{
            System.out.println("Ievadi paroli");
            ievaditaParole= scanner.nextLine();
            System.out.println();
        } while (!ievaditaParole.equals(parole));

        System.out.println("Pareiza parole");

        String[] kartis2 = {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};

        for (int j = 0; j < kartis2.length; j++) {
            System.out.println(kartis2[j]);
        }
        long[] telefonaNumuri = {222222, 333333, 444444, 555555, 534534543};

        for (long masivatelefons : telefonaNumuri) {
            System.out.println(masivatelefons);
        }












        //uzdevums 2 - pieprasīt no lietotāja ievadīt veselu skaitli, kamēr skaitli ir pozitivi
        //saskaitīt tos un izvadīt uz ekrāna summu, ja ir ievadīta 0 vai negatīvs(Jāizmanto scanner)






    }
    public static int calculateArea(int platums, int garums){
        return platums*garums;
    }
    public static void printNewLine(){
        System.out.println("\n");
    }
    public static void printCard(){
        System.out.println("@@@@@@@@@@");
        System.out.println("Agnese Briede");
        System.out.println("Riga");
        System.out.println("$$$$$$$$$$");


    }


    public static double avarage(double x, double y, double z){
        return x+y+z;
    }
    public static void printCard2(String vards, String uzvards, String pilseta, int vecums){
        System.out.println("@@@@@@@@@@");
        System.out.println(vards + "" + uzvards);
        System.out.println(pilseta);
        System.out.println("Vecums: "+vecums);
        System.out.println("$$$$$$$$$$");
    }

    public static void macamiesParMasiviem(){

        int[] monthlyCosts = {100, 40, 23, 44, 55, 200};
        String[] produktuSaraksts = {"piens", "maize", "olas"};

        String[]cars={"Volvo","BMW","Nissan","Mercedes"};
        System.out.println("Masiva garums ir: "+ cars.length);

        cars[1]= "Audi";

        String[] studentuSaraksts;

    }

}
