package org.example.Ex04_TestNG_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab015_TestNG_Groups {


    @Test(groups = {"sanity","regression"})
    public void test_sanityRun() {
        System.out.println("Sanity");
        System.out.println("QA");

    }

    @Test(groups={"regression"})
    public void test_regRun() {
        System.out.println("Reg");

    }

    @Test(groups={"smoke","regression"})
    public void test_smokeRun() {
        System.out.println("Smoke");

    }

}
