package lekcijaCetri.labDarbs;

import java.util.Date;

public class Velosipeds {
    String zimols;
    int ramjaIzmers;
    int atrums= 0;
    Date izgatavoshanasDatums;

    Velosipeds(){
        System.out.println("Taisaam jaunu velo");
        izgatavoshanasDatums = new Date();
        System.out.println("Izgatavoshanas datums" +izgatavoshanasDatums);
    }

    Velosipeds(String zimols, int ramjaIzmers, int atrums){
        izgatavoshanasDatums=new Date();
        this.zimols=zimols;
        this.ramjaIzmers=ramjaIzmers;
        this.atrums=atrums;
    }

    public void printAtrums() {
        System.out.println(atrums);
    }

    public void paatrinajums(){
        System.out.println("Velo paatrinas");
        atrums = atrums + 5;
    }

    public void bremzesana(){
        System.out.println("Velo Bremze");
        if (atrums>=5){
            atrums=atrums -5;
        }else {
            System.out.println("Beidz bremzeet, tu jau staavi");
        }

    }


}
