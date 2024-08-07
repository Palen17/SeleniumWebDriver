package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {

    @Test
    void test_hardassertion(){

        System.out.println("testing....");
        System.out.println("testing....");

        Assert.assertEquals(1, 2);

        System.out.println("testing....");
        System.out.println("testing....");
    }

    @Test
    void test_softassertion(){

        System.out.println("testing....");
        System.out.println("testing....");

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(1, 2); //soft assertion

        System.out.println("testing....");
        System.out.println("testing....");

        sa.assertAll(); // mandatory
    }
}
