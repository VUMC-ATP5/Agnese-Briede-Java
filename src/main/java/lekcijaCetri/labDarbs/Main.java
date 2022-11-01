package lekcijaCetri.labDarbs;

public class Main {

    public static void main(String[] args) {

        String vards="Agnese";
        House majaViens= new House(2,10,10,"brivibas 1",3,10000,false);
        majaViens.printHoouse();

        House majaDivi = new House();
        majaDivi.adrese ="Lachplesa iela 161";
        majaDivi.loguSkaits = 10;
        majaDivi.griestuAugstums =3.5;
        majaDivi.vaiPrivatipashums = true;
        majaDivi.stavuDaudzums = 5;
        majaDivi.kadastralaVertiba = 15000;
        majaDivi.durvjuSkaits = 4;
        majaDivi.printHoouse();

        char[] mansVards = {'A','G','N'};
        int i =0;
        for(char burts:mansVards) {
            System.out.println("Cikls NR" + i);
            System.out.println(burts);
            i++;
        }

        House[] majas = {majaViens, majaDivi};
        for (House maja: majas) {
            maja.printHoouse();
        }

        //medode
        Velosipeds mansVelo = new Velosipeds();
        System.out.println(mansVelo.atrums);

        Velosipeds ritenBraucejsViens = new Velosipeds();



        Velosipeds ritenBraucejsDivi = new Velosipeds();
        Velosipeds ritenisX =new Velosipeds("ZZK",21,100);
        System.out.println(ritenisX);

        ritenBraucejsViens.atrums = 40;
        ritenBraucejsDivi.atrums = 30;

        ritenBraucejsViens.printAtrums();
        ritenBraucejsDivi.printAtrums();

        Velosipeds ritenBraucejsTris = new Velosipeds();
        System.out.println("Izgatavoshanas datums"+ritenBraucejsTris.izgatavoshanasDatums);
        ritenBraucejsDivi.printAtrums();

        ritenBraucejsTris.paatrinajums();
        ritenBraucejsTris.paatrinajums();
        ritenBraucejsTris.paatrinajums();
        ritenBraucejsTris.paatrinajums();

        ritenBraucejsTris.printAtrums();
        System.out.println("Prieksaa izskier kakis");

        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();


        Automasina masinaViens = new Automasina();
        masinaViens.apdrosinana = true;
        masinaViens.krasa = "zila";
        masinaViens.durvjuSkaits = 4;
        masinaViens.marka = "Audi";
        masinaViens.nobraukums = 100150;
        masinaViens.printAuto();

        Rinkis rinkis1 = new Rinkis(4);
        System.out.println(rinkis1.rekinatLaukumu());
        System.out.println(rinkis1.rekinatRinkaLinijasGarumu());


        Rinkis rinkis2 = new Rinkis(10);
        System.out.println(rinkis2.rekinatLaukumu());
        System.out.println(rinkis2.rekinatRinkaLinijasGarumu());

        int a = 5;
        int b= 10;
        Math.max(5,10);
        System.out.println(Math.max(a,b));

    }


}
