package lekcijaPieci.majasDarbs;

public class Cylinder {

    private int height;
    private int radius;

    public int getHeight() {
        return height;
    }

    public int getRadius() {
        return radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double calculateVolume(){
        return Math.PI*radius*radius*height;
    }

    public double calculateSurfaceArea(){
        return 2*Math.PI*radius*height;
    }

    public Cylinder() {

    }

    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

}
