package org.example.Ex05_Test_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Lab023_TestNG_Assertions {

    @Test(enabled = true)
    public void test_hardAssertExample() {
        System.out.println("Start of the program");
       Assert.assertEquals("pramod","Pramod");
        System.out.println("End of the program");
    }

    // Software Assertion
    @Test
    public void test_softAssertExample() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("pramod","Pramod");
        System.out.println("End of program");
        softAssert.assertAll();
    }
}
