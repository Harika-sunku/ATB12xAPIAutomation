package org.example.Ex04_TestNG_Examples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab013_BeforeTest {

    @BeforeTest
    public void before_test(){
        System.out.println("This is before test method");
    }

    @Test
    public void test_PUT(){
        // token and BookingID
        System.out.println(" PUT REQUEST");
    }

    @AfterTest

    public void after_test(){
        System.out.println("This is after test method");
    }


}
