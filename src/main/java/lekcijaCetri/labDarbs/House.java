package lekcijaCetri.labDarbs;

public class House {

    public House(int stavuDaudzums, int loguSkaits, int durvjuSkaits, String adrese, double griestuAugstums, long kadastralaVertiba, boolean vaiPrivatipashums) {
        this.stavuDaudzums = stavuDaudzums;
        this.loguSkaits = loguSkaits;
        this.durvjuSkaits = durvjuSkaits;
        this.adrese = adrese;
        this.griestuAugstums = griestuAugstums;
        this.kadastralaVertiba = kadastralaVertiba;
        this.vaiPrivatipashums = vaiPrivatipashums;
    }

    House (){

    }

    //tikai raseejums
    int stavuDaudzums;
    int loguSkaits;
    int durvjuSkaits;
    String adrese;
    double griestuAugstums;
    long kadastralaVertiba;
    boolean vaiPrivatipashums;

    public void printHoouse() {
        System.out.println("House{" +
                "stavuDaudzums=" + stavuDaudzums +
                ", loguSkaits=" + loguSkaits +
                ", durvjuSkaits=" + durvjuSkaits +
                ", adrese='" + adrese + '\'' +
                ", griestuAugstums=" + griestuAugstums +
                ", kadastralaVertiba=" + kadastralaVertiba +
                ", vaiPrivatipashums=" + vaiPrivatipashums +
                '}');
    }
}

