package lekcijaSesiTest.labDarbs;

import lekcijaCetri.labDarbs.Rinkis;
import org.testng.Assert;
import org.testng.annotations.Test;

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
    @Test
    public void rekinatRinkaLinijasGarumu (){

        Rinkis mansRinkisDivi = new Rinkis(4);
        Double expectedLenght = 26.12;
        Double actualLenght =mansRinkisDivi.rekinatRinkaLinijasGarumu();
        Assert.assertEquals(expectedLenght,actualLenght);

    }

}
