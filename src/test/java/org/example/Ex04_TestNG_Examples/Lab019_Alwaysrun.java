package org.example.Ex04_TestNG_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab019_Alwaysrun {

    @Test
    public void test_new_register() {
        Assert.assertTrue(true);
    }

    @Test(alwaysRun = true)
    public void test_loginPage() {
        Assert.assertTrue(true);
    }

}
