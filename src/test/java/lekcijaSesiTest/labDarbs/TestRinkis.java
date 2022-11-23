package lekcijaSesiTest.labDarbs;

import lekcijaCetri.labDarbs.Rinkis;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestRinkis {

    @Test
    public void testRekinatLaukumu(){
        System.out.println("Hello test. Mans pirmais tests");
        Rinkis mansRinkis = new Rinkis(4.5);

        //expectedResult - sagaidāmais rezultāts
        //actualResult - reālais laukums

        Double expectedArea =63.585;
        Double actualArea = mansRinkis.rekinatLaukumu();
        //assert/assertion - pārbaudes
        Assert.assertEquals(actualArea,expectedArea);

    }

    @BeforeTest
    public void beforeTest (){
        System.out.println("Shii ir BEFORE test anotaacija");
    }

    @AfterTest
    public void afterTest (){
        System.out.println("Shii ir After test anotaacija");
    }


    @BeforeMethod
    public void setup (){
        System.out.println("Shii metode tiek izpildiita pirms katra testa");

    }

    @AfterMethod
    public void afterWork(){
        System.out.println("Shii metode straadaa AFTER/katra testa");
    }

    @Test
    public void rekinatRinkaLinijasGarumu (){

        Rinkis mansRinkisDivi = new Rinkis(4);
        Double expectedLenght = 25.12;
        Double actualLenght =mansRinkisDivi.rekinatRinkaLinijasGarumu();
        Assert.assertEquals(expectedLenght,actualLenght);

    }

}
