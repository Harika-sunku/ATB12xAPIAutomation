package org.example.Ex04_TestNG_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab016_TestNG_DependsOnMethod {

    @Test
    public void serverStartedOk() {
        System.out.println("I will run first");

    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void test1() {
        System.out.println("method1");

    }


}
