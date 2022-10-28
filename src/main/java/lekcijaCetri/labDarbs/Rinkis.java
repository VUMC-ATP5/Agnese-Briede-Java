package lekcijaCetri.labDarbs;

public class Rinkis {
    double r;
    final double PI=Math.PI;

    public Rinkis(double r) {
        this.r = r;
    }

    public double rekinatLaukumu(){
        return r * r * PI;
    }

    public double rekinatRinkaLinijasGarumu(){
        return 2*PI*r;
    }
}
