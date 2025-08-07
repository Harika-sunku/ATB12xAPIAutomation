package org.example.Ex04_TestNG_Examples;

import org.testng.annotations.Test;

public class Lab020_TestNG_invocationCount {

    @Test(invocationCount = 1)
    public void test_tc1(){
        System.out.println("Hi!!!");

    }
    @Test(invocationCount = 2)
    public void test_tc2(){
        System.out.println("How are you!!!");

    }

    @Test(invocationCount = 3)
    public void test_tc3(){
        System.out.println("Bye");

    }


}
