package lekcijaCetri.majasDarbs.classHomework;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Triangle {

    int a, b, c, sp;
    double area;

    public Triangle(){
        this.a = 2;
        this.b = 2;
        this.c = 3;
        this.sp = this.calculateSp();
        this.area = this.calculateArea();
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.sp = this.calculateSp();
        this.area = this.calculateArea();
    }

    public Triangle(int a, int b, int c, double area) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.sp = this.calculateSp();
        this.area = area;
    }



    private double calculateArea(){
        return Math.sqrt(this.sp * (this.sp - this.a) * (this.sp - this.b) * (this.sp - this.c));
    }

    private int calculateSp(){
        return (this.a + this.b + this.c) / 2;
    }


    public boolean isEvenSides(){
            return true;
    }

    public boolean isUnEvenSides(){
        return !this.isEvenSides();
    }


    public static void main(String[] args) {
        Triangle noConstructorTriangle = new Triangle(); //uses the constructor with 0 arguments
        Triangle withhoutArea = new Triangle(2, 3, 4); //uses the constructor with only 3 arguments
        Triangle withArea = new Triangle(2,2, 2, 6); // uses the constructor with 4 arguments
    }
}

