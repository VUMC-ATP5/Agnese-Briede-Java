package lekcijaSesiTest.majasDarbs;

import lekcijaSesi.majasDarbs.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCalculator {

    @Test
    public void testAdd(){
        System.out.println("Test Add");
        Calculator mycalculator = new Calculator();
        int expectedAdd=25;
        Assert.assertEquals(mycalculator.add(10,15),expectedAdd);
    }

    @Test
    public void testSubract(){
        System.out.println("Test Substract");
        Calculator myCalculator1 = new Calculator();
        int expectedSub =3;
        Assert.assertEquals(myCalculator1.substract(9,6),expectedSub);
    }

    @Test
    public void testMultiplay(){
        System.out.println("Test Multiplay");
        Calculator myCalculator2 = new Calculator();
        int expectedMultiplay=24;
        Assert.assertEquals(myCalculator2.multiply(6,4),expectedMultiplay);
    }

    @Test
    public void testDevide(){
        System.out.println("Test Devide");
        Calculator myCalculator3 = new Calculator();
        int expectedDevide = 10;
        Assert.assertEquals(myCalculator3.divide(150,10),expectedDevide);

    }
}
