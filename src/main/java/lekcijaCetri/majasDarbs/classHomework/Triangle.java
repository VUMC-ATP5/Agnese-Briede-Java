package lekcijaCetri.majasDarbs.classHomework;

public class Triangle {

    public int a, b, c, sp=0;
    public double area= 0.0;

    public Triangle(){
        System.out.println("We are creating triangles");

    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateSp(){
        System.out.println(this.sp * (this.sp - this.a) * (this.sp - this.b) * (this.sp - this.c));
        System.out.println(Math.sqrt(this.sp * (this.sp - this.a) * (this.sp - this.b) * (this.sp - this.c)));
        return Math.sqrt(this.sp * (this.sp - this.a) * (this.sp - this.b) * (this.sp - this.c));
    }

    public int calculateArea(){
        return (this.a + this.b + this.c) / 2;
    }


    public boolean isEvenSides(){
            return true;
    }

    public boolean isUnEvenSides(){
        return !this.isEvenSides();
    }


//    //public static void main(String[] args) {
//        Triangle noConstructorTriangle = new Triangle(); //uses the constructor with 0 arguments
//        //Triangle withhoutArea = new Triangle(2, 3, 4); //uses the constructor with only 3 arguments
//        Triangle withArea = new Triangle(2,2, 2, 6); // uses the constructor with 4 arguments}

}

